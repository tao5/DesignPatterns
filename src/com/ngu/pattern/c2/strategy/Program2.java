package com.ngu.pattern.c2.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.ngu.pattern.Utils.*;

/**
 * 在 Program1 的基础上，增加打折需求
 * 改动不大，只是在求总价前，乘以折扣，
 * 但是也会造成一个问题，如果需要频繁更换折扣(商场今天 8 折，明天半价，常有的事)，
 * 或是打折的规则(比如买 300 减 100)，以下代码就会导致频繁的更改 getDiscount()
 * 中的规则，缺失了程序的灵活性
 */
public class Program2 {
	

	public static void main(String[] args) {
		
		String[] discountRules = new String[]{"half-price", "full-price", "twenty-percent-off"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double price = 0;
		double quantity = 0;
		double total = 0;
		String priceText = null;
		String quantityText = null;
		
		String discountRule = discountRules[0];
		double discount = getDiscount(discountRule);
		
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
				
				total += price * quantity * discount;
				println("total price : " + total);
				
			}
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
	
	private static double getDiscount(String discountRule) {
		switch (discountRule) {
		case "half-price":
			return 0.5;
		case "twenty-percent-off":
			return 0.8;
		default:
			return 1;
		}
	}

	private static boolean isQuit(String line) {
		return "q".equals(line);
	}

		
}
