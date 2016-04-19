package com.ngu.pattern.c2.strategy;

public class Program3DiscountFactory {

	public static Program3Discount createDiscountRule(String discountRule) throws Program3DiscountNullException {
		Program3Discount discount;
		switch (discountRule) {
		case "half-price":
			discount = new Program3DiscountHalf();
			break;
		case "twenty-percent-off":
			discount = new Program3DiscountTwentyOff();
			break;
		case "full-price":
			discount = new Program3DiscountFull();
			break;
		case "300sub100":
			discount = Program3Discount300Sub100.getInstance();
			break;
		default:
			throw new Program3DiscountNullException("invalid discount rule.");
		}
		return discount;
	}

}
