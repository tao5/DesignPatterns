package com.ngu.pattern.c1.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 在"Program3"的基础上，"解耦"，提升程序的扩展性，比如，如果后续需要增添新运算符
 * 则只需要在 Program4OperationFactory 的 createOperation 方法中增加新的
 * 运算符并增加对应的新运算符实现类继承 Program4Operation 即可，而不需要对其它
 * 类做任何改动（改动少，自然就不易出错了:)）。
 * ps.新实现参考：Program4OperationSquare
 * 
 * ============================
 * 以上便是"简单工厂"的实现(160418)
 * ============================
 * 
 */
public class Program4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numberA = null;
		String numberB = null;
		String sign = null;
		String result = null;
		try {
			System.out.println("input number a : ");
			numberA = br.readLine();
			System.out.println("input sign : ");
			sign = br.readLine();
			System.out.println("input number b : ");
			numberB = br.readLine();
			System.out.print("result = ");
			result = Program4OperationFactory.createOperation(sign).getResult(numberA, numberB);
			System.out.println(result);
		} catch (Program4OperationNullException e) {
			System.out.println("[error : " + e.getMessage() + "]");
		} catch (IOException e) {
			System.out.println("[error : " + e.getMessage() + "]");
		}
	}

}
