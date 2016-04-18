package com.ngu.pattern.c1.simplefactory;

public class Program3Operation {
	
	public static String getResult(String numberA, String numberB, String sign) {
		if (!filterNumber(numberA)) {
			return "input vaild number a plz.";
		}
		if (!filterNumber(numberB)) {
			return "input vaild number b plz.";
		}
		String result = "error";
		switch (sign) {
		case "+":
			result = Integer.parseInt(numberA) + Integer.parseInt(numberB) + "";
			break;
		case "-":
			result = Integer.parseInt(numberA) - Integer.parseInt(numberB) + "";
			break;
		case "*":
			result = Integer.parseInt(numberA) * Integer.parseInt(numberB) + "";
			break;
		case "/":
			if (Integer.parseInt(numberB) == 0) {
				result = "number b can't be zero.";
			} else {
				result = Integer.parseInt(numberA) / Integer.parseInt(numberB) + "";
			}
			break;
		default:
			result = "input vaild sign plz, include : + - * / ";
			break;
		}
		return result;
	}
	
	private static boolean filterNumber(String number) {
		try {
			Integer.parseInt(number);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
