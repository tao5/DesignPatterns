package com.ngu.pattern.c2.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.ngu.pattern.Utils.*;

/**
 * 在 Program6 基础上，将 DiscountContext 改成静态，简洁不少，并且好像也没什么问题...
 * 
 * 最后比对下，"简单工厂"和"策略"的代码实现，参照：Program3DiscountFactory 和 Program7DiscountContext
 * 会发现差别其实不是很大，Program3DiscountFactory 根据客户端的规则返回对应的实现类（工厂嘛，顾名思义就是用来创建实现类的），
 * Program7DiscountContext 则根据客户端的规则，直接返回客户端需要的结果，封装的更彻底一些（好吧，其实就是一个方法）。
 */
public class Program7 {
	
	public static void main(String[] args) {
		
		String[] discountRules = new String[]{"half-price", "full-price", "twenty-percent-off", "300sub100"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double price = 0;
		double quantity = 0;
		double total = 0;
		String priceText = null;
		String quantityText = null;
		
		String halfPrice = discountRules[0];
		String return100Reach300 = discountRules[3];
		
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
				// 半价
				// total += Program7DiscountContext.executeDiscount(halfPrice, price * quantity);
				// 同时满足 300 减 100 和"半价"
				total += Program7DiscountContext.executeDiscount(halfPrice, price * quantity);
				total = Program7DiscountContext.executeDiscount(return100Reach300, total);
				println("total price : " + total);
				
			}
		} catch (IOException e) {
			printErrorMessage(e.getMessage());
		} catch (Program3DiscountNullException e) {
			printErrorMessage(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				printErrorMessage(e.getMessage());
			}
		}
	}

	private static boolean isQuit(String line) {
		return "q".equals(line);
	}

		
}
