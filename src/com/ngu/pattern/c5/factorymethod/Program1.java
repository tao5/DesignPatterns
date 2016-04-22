package com.ngu.pattern.c5.factorymethod;

import static com.ngu.pattern.Utils.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Program1 "简单工厂"
 * Program2 "工厂方法"
 */
public class Program1 {

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
			result = Program1OperationFactory.createOperation(sign).getResult(numberA, numberB);
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

}
