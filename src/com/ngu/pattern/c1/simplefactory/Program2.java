package com.ngu.pattern.c1.simplefactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 在"Program2"的基础上，对"除数为0"等异常进行处理
 */
public class Program2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input number a : ");
		String numberA = null;
		String numberB = null;
		String sign = null;
		String result = null;
		try {
			numberA = br.readLine();
			System.out.println("input sign : ");
			sign = br.readLine();
			System.out.println("input number b : ");
			numberB = br.readLine();
			if (!filterNumber(numberA)) {
				System.out.println("input vaild number a");
				return;
			}
			if (!filterNumber(numberB)) {
				System.out.println("input vaild number b");
				return;
			}
			System.out.print("result = ");
			if ("+".equals(sign)) {
				result = Integer.parseInt(numberA) + Integer.parseInt(numberB) + "";
			} else if ("-".equals(sign)) {
				result = Integer.parseInt(numberA) - Integer.parseInt(numberB) + "";
			} else if ("*".equals(sign)) {
				result = Integer.parseInt(numberA) * Integer.parseInt(numberB) + "";
			} else if ("/".equals(sign)) {
				if (Integer.parseInt(numberB) == 0) {
					result = "number b can't be zero.";
				} else {
					result = Integer.parseInt(numberA) / Integer.parseInt(numberB) + "";
				}
			} else {
				result = "error";
			}
			System.out.println(result);
		} catch (Exception e) {
			result = "error";
			System.out.println(result);
		}
	}

	private static boolean filterNumber(String numberA) {
		try {
			Integer.parseInt(numberA);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
