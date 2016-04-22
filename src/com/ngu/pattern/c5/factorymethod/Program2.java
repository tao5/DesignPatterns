package com.ngu.pattern.c5.factorymethod;

import static com.ngu.pattern.Utils.print;
import static com.ngu.pattern.Utils.printErrorMessage;
import static com.ngu.pattern.Utils.printWithSingleLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numberA = null;
		String numberB = null;
		String sign = null;
		String result = null;
		try {
			print("input number a : ");
			numberA = br.readLine();
			print("input sign : ");
			sign = br.readLine();
			printWithSingleLine("input number b : ");
			numberB = br.readLine();
			print("result is : ");
			result = getFactory(sign).createOperation().getResult(numberA, numberB);
			//result = Program1OperationFactory.createOperation(sign).getResult(numberA, numberB);
			print(result);
		} catch (Program1OperationNullException e) {
			printErrorMessage(e.getMessage());
		} catch (IOException e) {
			printErrorMessage(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				printErrorMessage(e.getMessage());
			}
		}	
	}
	
	private static Program2IFactory getFactory(String sign) {
		Program2IFactory factory = null;
		switch (sign) {
		case "+":
			factory = new Program2AddFactory();
			break;
		case "-":
			factory = new Program2SubFactory();
			break;
		case "*":
			factory = new Program2MulFactory();
			break;
		case "/":
			factory = new Program2DivFactory();
			break;
		default :
			throw new Program1OperationNullException("input vaild sign plz, include : + - * / square");
		}
		return factory;
	}
}
