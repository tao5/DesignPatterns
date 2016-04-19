package com.ngu.pattern.c2.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.ngu.pattern.Utils.*;

/**
 * 在 Program3 的基础上，使用"策略模式"重构。
 * 之前说过，这里的打折规则是长期处于变换状态的，即打折算法是"易变更"的，而面
 * 对这种不稳定的算法，使用"简单工厂模式"就不是很合适了，应该使用"策略模式"。
 * 重构后由代码可见："策略"和"简单工厂"的区别其实并不是很大，只是将"易变动"的
 * 部分交由客户端去做了。
 */
public class Program4 {
	
	public static void main(String[] args) {
		
		String[] discountRules = new String[]{"half-price", "full-price", "twenty-percent-off", "300sub100"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double price = 0;
		double quantity = 0;
		double total = 0;
		String priceText = null;
		String quantityText = null;
		
		String discountRule = discountRules[3];
		Program4DiscountContext discountContext = null;
		
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
				discountContext = new Program4DiscountContext(getDiscount(discountRule));
				total = discountContext.execute(total);
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
	
	private static Program3Discount getDiscount(String discountRule) {
		switch (discountRule) {
		case "half-price":
			return new Program3DiscountHalf();
		case "twenty-percent-off":
			return new Program3DiscountTwentyOff();
		case "300sub100":
			return Program3Discount300Sub100.getInstance();
		default:
			return new Program3DiscountFull();
		}
	}

	private static boolean isQuit(String line) {
		return "q".equals(line);
	}

		
}
