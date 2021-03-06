package com.ngu.pattern.c2.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.ngu.pattern.Utils.*;

/**
 * 需求：做一个商场收银软件，营业员输入商品价格和数量后，能得到商品总价格
 * "面向过程"式编程，写出以下代码
 * 
 * Program1 基本实现
 * Program2 增加打折功能
 * Program3 "简单工厂"重构
 * Program4 "策略"重构
 * Program5 将"策略静态"
 * Program6 "策略"和"简单工厂"相结合
 * Program7 将"静态静态"
 * 
 */
public class Program1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double price = 0;
		double quantity = 0;
		double total = 0;
		String priceText = null;
		String quantityText = null;
		try {
			while (true) {
				print("input price : ");
				priceText = br.readLine();
				if(isQuit(priceText)) break;
				if (isNumber(priceText)) {
					price = Double.parseDouble(priceText);
				} else {
					println("input vaild price plz.");
					continue;
				}
				
				print("input quantity : ");
				quantityText = br.readLine();
				if(isQuit(quantityText)) break;
				if (isNumber(quantityText)) {
					quantity = Double.parseDouble(quantityText);
			 	} else {
					println("input vaild quantity plz.");
					continue;
			 	}
				
				total += price * quantity;
				println("total price : " + total);
				
			}
		} catch (IOException e) {
			printErrorMessage(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static boolean isQuit(String line) {
		return "q".equals(line);
	}

		
}
