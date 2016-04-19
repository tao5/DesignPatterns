package com.ngu.pattern.c2.strategy;

public class Program4DiscountContext {

	public Program3Discount discount;
	
	public Program4DiscountContext(Program3Discount discount) {
		this.discount = discount;
	}
	
	public double execute(double totalPrice) {
		return discount.discount(totalPrice);
	}
	
}
