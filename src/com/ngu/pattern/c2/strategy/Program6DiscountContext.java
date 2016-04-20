package com.ngu.pattern.c2.strategy;

public class Program6DiscountContext {
	
	private Program3Discount discount;
	
	public Program6DiscountContext(String discountRule) throws Program3DiscountNullException {
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
	}
	
	public double executeDiscount(double totalPrice) {
		return discount.discount(totalPrice);
	}
	
}
