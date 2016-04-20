package com.ngu.pattern.c2.strategy;

public class Program7DiscountContext {
	
	public static double executeDiscount(String discountRule, double totalPrice) {
		Program3Discount discount;
		switch (discountRule) {
		case "half-price":
			discount = new Program3DiscountHalf();
			break;
		case "twenty-percent-off":
			discount = new Program3DiscountTwentyOff();
			break;
		case "300sub100":
			discount = Program3Discount300Sub100.getInstance();
			break;
		case "full-price":
			discount = new Program3DiscountFull();
			break;
		default:
			throw new Program3DiscountNullException("invalid discount rule.");
		}
		return discount.discount(totalPrice);
	}
	
}
