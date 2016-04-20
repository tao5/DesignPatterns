package com.ngu.pattern.c2.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.ngu.pattern.Utils.*;

/**
 * 在 Program5 基础上，将策略和简单工厂相结合
 * 把判断逻辑转移到 DiscountContext 中，至此客户端只需要知道 DiscountContext 这一个类，和
 * 之前的工厂模式相比较：客户端需要知道 DiscountFactory 和 Discount 两个类。耦合度减低了
 */
public class Program6 {
	
	public static void main(String[] args) {
		
		String[] discountRules = new String[]{"half-price", "full-price", "twenty-percent-off", "300sub100"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double price = 0;
		double quantity = 0;
		double total = 0;
		String priceText = null;
		String quantityText = null;
		
		String discountRule = discountRules[0];
		Program6DiscountContext discountContext = new Program6DiscountContext(discountRule);
		
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
				total += discountContext.executeDiscount(price * quantity);
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
