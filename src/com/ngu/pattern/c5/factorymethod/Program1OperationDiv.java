package com.ngu.pattern.c5.factorymethod;

public class Program1OperationDiv extends Program1Operation {

	@Override
	protected String getResult(String numberA, String numberB) {
		if(isError(numberA, numberB)) return "";
		if (Integer.parseInt(numberB) == 0) {
			return "[error : number b (divisor) can't be zero.]";
		} else {
			return Double.parseDouble(numberA) / Double.parseDouble(numberB) + "";
		}
	}

}
