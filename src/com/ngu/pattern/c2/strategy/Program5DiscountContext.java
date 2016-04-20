package com.ngu.pattern.c2.strategy;

public class Program5DiscountContext {
	
	public static double executeDiscount(Program3Discount discount, double totalPrice) {
		return discount.discount(totalPrice);
	}
	
}
