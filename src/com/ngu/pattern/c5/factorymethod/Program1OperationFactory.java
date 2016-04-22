package com.ngu.pattern.c5.factorymethod;

public class Program1OperationFactory {

	public static Program1Operation createOperation(String sign) {
		Program1Operation operation = null;
		switch (sign) {
		case "+":
			operation = new Program1OperationAdd();
			break;
		case "-":
			operation = new Program1OperationSub();
			break;
		case "*":
			operation = new Program1OperationMul();
			break;
		case "/":
			operation = new Program1OperationDiv();
			break;
//		case "square":
//			operation = new Program1OperationSquare();
//			break;
		default:
			throw new Program1OperationNullException("input vaild sign plz, include : + - * / square");
		}
		return operation;
	}
}
