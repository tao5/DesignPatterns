package com.ngu.pattern.c1.simplefactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 需求：编写一个简单的能实现"加减乘除"运算的程序。
 * 最直观能想到的，由上至下"面向过程"式的解题思路。
 */
public class Program1 {

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
			System.out.println("result is = ");
			if ("+".equals(sign)) {
				result = Integer.parseInt(numberA) + Integer.parseInt(numberB) + "";
				System.out.println();
			} else if ("-".equals(sign)) {
				result = Integer.parseInt(numberA) - Integer.parseInt(numberB) + "";
			} else if ("*".equals(sign)) {
				result = Integer.parseInt(numberA) * Integer.parseInt(numberB) + "";
			} else if ("/".equals(sign)) {
				result = Integer.parseInt(numberA) / Integer.parseInt(numberB) + "";
			} else {
				result = "error";
			}
			System.out.println(result);
		} catch (Exception e) {
			result = "error";
			System.out.println(result);
		}
	}

}
