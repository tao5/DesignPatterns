package com.ngu.pattern.c1.simplefactory;

public class Program4OperationMul extends Program4Operation {

	@Override
	protected String getResult(String numberA, String numberB) {
		if (super.getResult(numberA, numberB) != null) {
			return super.getResult(numberA, numberB);
		}
		return Integer.parseInt(numberA) * Integer.parseInt(numberB) + "";
	}

}
