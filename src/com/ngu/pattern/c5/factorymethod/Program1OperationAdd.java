package com.ngu.pattern.c5.factorymethod;

public class Program1OperationAdd extends Program1Operation {

	@Override
	protected String getResult(String numberA, String numberB) {
		if(isError(numberA, numberB)) return "";
		return Double.parseDouble(numberA) + Double.parseDouble(numberB) + "";
	}

}
