package com.ngu.pattern.c1.simplefactory;

public abstract class Program4Operation {
	
	protected String sign;
	
	public Program4Operation() {
		
	}
	
	protected String getResult(String numberA, String numberB) {
		if (!isNumber(numberA)) {
			return "[error : input vaild number a plz.]";
		}
		if (!isNumber(numberB)) {
			return "[error : input vaild number b plz.]";
		}
		return null;
	}
	
	protected static boolean isNumber(String number) {
		try {
			Double.parseDouble(number);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
