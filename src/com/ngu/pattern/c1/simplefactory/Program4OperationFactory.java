package com.ngu.pattern.c1.simplefactory;

public class Program4OperationFactory {
	
	public static Program4Operation createOperation(String sign) throws Program4OperationNullException {
		Program4Operation operation = null;
		switch (sign) {
		case "+":
			operation = new Program4OperationAdd();
			break;
		case "-":
			operation = new Program4OperationSub();
			break;
		case "*":
			operation = new Program4OperationMul();
			break;
		case "/":
			operation = new Program4OperationDiv();
			break;
		case "square":
			operation = new Program4OperationSquare();
			break;
		default:
			throw new Program4OperationNullException("input vaild sign plz, include : + - * / square");
		}
		return operation;
	}
}
