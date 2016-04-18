package com.ngu.pattern.c1.simplefactory;

/**
 * 两数各自的平方和
 */
public class Program4OperationSquare extends Program4Operation {

	@Override
	protected String getResult(String numberA, String numberB) {
		return super.getResult(numberA, numberB) == null ? (Math.pow(Integer.parseInt(numberA), 2) + Math.pow(Integer.parseInt(numberB), 2) + "") : super.getResult(numberA, numberB);
	}

}
