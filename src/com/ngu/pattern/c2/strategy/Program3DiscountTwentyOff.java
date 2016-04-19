package com.ngu.pattern.c2.strategy;

public class Program3DiscountTwentyOff extends Program3Discount {

	@Override
	public double discount(double totalPrice) {
		return totalPrice * 0.8;
	}

}
