package com.ngu.pattern.c2.strategy;

public class Program3Discount300Sub100 extends Program3Discount {

	// 如果已经打过折了，则不再重复打折了
	private boolean discounted = false;
	
	private static Program3Discount300Sub100 instance = new Program3Discount300Sub100();
	
	private Program3Discount300Sub100() {}
	
	public static Program3Discount300Sub100 getInstance() {
		return instance;
	}
	
	@Override
	public double discount(double totalPrice) {
		double price = totalPrice;
		if (totalPrice >= 300 && !discounted ) {
			price = totalPrice - 100;
			discounted = true;
		}
		return price;
	}

}
