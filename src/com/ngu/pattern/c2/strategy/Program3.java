package com.ngu.pattern.c2.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.ngu.pattern.Utils.*;

/**
 * 在 Program2 的基础上，为增加程序的"扩展性"，使用"简单工厂"模式，抽取出打折规则，便于规则的扩展
 * 重构后的代码，如果还需要添加新的打折规则，则只需修改 Program3DiscountFactory 中的 createDiscountRule 方法
 * 在此方法中实现新的打折规则即可，比如实现 Program3Discount300Sub100，打折规则：总价满 300 减 100
 */
public class Program3 {

	public static void main(String[] args) {
		
		String[] discountRules = new String[]{"half-price", "full-price", "twenty-percent-off", "300sub100"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double price = 0;
		double quantity = 0;
		double total = 0;
		String priceText = null;
		String quantityText = null;
		
		String discountRule = discountRules[0];
		
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
				total += Program3DiscountFactory.createDiscountRule(discountRule).discount(price * quantity);
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
