package com.ngu.pattern.c2.strategy;

public class Program3DiscountFull extends Program3Discount {

	@Override
	public double discount(double totalPrice) {
		return totalPrice;
	}

}
