package com.ngu.pattern.c1.simplefactory;

public class Program4OperationDiv extends Program4Operation {

	@Override
	protected String getResult(String numberA, String numberB) {
		if (super.getResult(numberA, numberB) == null) {
			String result = null;
			if (Integer.parseInt(numberB) == 0) {
				result = "[error : number b (divisor) can't be zero.]";
			} else {
				result = Double.parseDouble(numberA) / Double.parseDouble(numberB) + "";
			}
			return result;
		}
		return super.getResult(numberA, numberB);
	}

}
