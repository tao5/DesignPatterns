package com.ngu.pattern.c1.simplefactory;

public class Program4OperationDiv extends Program4Operation {

	@Override
	protected String getResult(String numberA, String numberB) {
		if (super.getResult(numberA, numberB) != null) {
			return super.getResult(numberA, numberB);
		}
		String result = null;
		if (Integer.parseInt(numberB) == 0) {
			result = "[error : number b can't be zero.]";
		} else {
			result = Integer.parseInt(numberA) / Integer.parseInt(numberB) + "";
		}
		return result;
	}

}
