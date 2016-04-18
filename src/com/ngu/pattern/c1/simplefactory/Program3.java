package com.ngu.pattern.c1.simplefactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 在"Program2"的基础上，将逻辑和界面进行分离，优化后可见，界面清爽很多
 */
public class Program3 {

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
			System.out.print("result = ");
			result = Program3Operation.getResult(numberA, numberB, sign);
			System.out.println(result);
		} catch (Exception e) {
			result = "error";
			System.out.println(result);
		}
	}

}
