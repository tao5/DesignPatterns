package com.ngu.pattern.c2.strategy;

/**
 * Context 用于维护 Discount（Strategy）对象的引用
 */
public class Program4DiscountContext {
	
	private Program3Discount discount;
	
	// 通过构造函数，传入具体的策略（这里 Program3Discount 改名为 DiscountStrategy 较为合适）
	public Program4DiscountContext(Program3Discount discount) {
		this.discount = discount;
	}
	
	public double executeDiscount(double totalPrice) {
		return discount.discount(totalPrice);
	}
	
}
