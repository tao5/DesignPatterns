package com.ngu.pattern.c1.simplefactory;

public class Program4OperationSub extends Program4Operation {

	@Override
	protected String getResult(String numberA, String numberB) {
		return super.getResult(numberA, numberB) == null ? Double.parseDouble(numberA) - Double.parseDouble(numberB) + "" : super.getResult(numberA, numberB);
	}

}
