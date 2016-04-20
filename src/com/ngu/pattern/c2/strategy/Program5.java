package com.ngu.pattern.c2.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static com.ngu.pattern.Utils.*;

/**
 * 在 Program4 的基础上，把 Program4DiscountContext2 改成了静态，
 * 好像并没有什么不妥（待思考），原先由 Program4DiscountContext 维
 * 护对 Discount（"策略"）的引用反倒显得多余？
 * 
 * "简单工厂"和"策略"最大的区别：一个是在内部根据不同的条件创建相应的对象，
 * 一个是将创建对象的动作交给外部的调用者来做，由调用者决定使用哪种具体对象，
 * 它"模糊"了具体使用哪个对象。
 * 
 * 从类图上看，"简单工厂"和"策略"的唯一区别是：
 * "简单工厂"里的 DiscountFactory 和 Discount 抽象类是依赖关系（Discount 对象是局部变量），
 * 而"策略"里的 DiscountContext 和 Discount 抽象类是关联关系（Discount 对象是成员变量），如果改成静态，Discount对象则是参数，又变成依赖关系了。
 */
public class Program5 {
	
	public static void main(String[] args) {
		
		String[] discountRules = new String[]{"half-price", "full-price", "twenty-percent-off", "300sub100"};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double price = 0;
		double quantity = 0;
		double total = 0;
		String priceText = null;
		String quantityText = null;
		
		String discountRule = discountRules[3];
		
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
				total += Program5DiscountContext.executeDiscount(getDiscount(discountRule), price * quantity);
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
