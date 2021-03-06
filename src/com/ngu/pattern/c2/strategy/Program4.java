package com.ngu.pattern.c2.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.ngu.pattern.Utils.*;

/**
 * 在 Program3 的基础上，使用"策略模式"重构。
 * 
 * 之前说过，这里的打折规则是长期处于变换状态的，即打折算法是"易变更"的，而面
 * 对这种不稳定的算法，使用"简单工厂模式"就不是很合适了，应该使用"策略模式"。
 * 
 * 重构后由代码可见："策略"和"简单工厂"的区别其实并不是很大。回想一下，在之前的"
 * 简单工厂模式"里，如果需要添加新的打折规则，需要更改 DiscountFactory 中的代
 * 码，在 createDiscountRule 方法中添加判断和新的打折规则，并实现相应的打折规
 * 则。DiscountFactory 需要变动。而使用"策略模式"重构之后，虽然依旧需要添加新
 * 的打折类（这是必不可少的，添加了新的算法，自然需要去做具体实现），但
 * Program4DiscountContext 并不需要做改动，算法被封装了起来，可以实现算法替
 * 换，而不会影响到使用算法的客户。
 * 
 * 哪些是不变的，哪些是易变的，是这里("策略"和"简单工厂")的区分重点。
 * 
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
		
		String discountRule = discountRules[0];
		
		Program4DiscountContext discountContext = new Program4DiscountContext(getDiscount(discountRule));
		
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
