package com.ngu.pattern.c8.facade;

/**
 * 客户不需要知道基金机构内部是如何操作股票的，客户只需要关注基金的涨跌，买入卖出即可
 */
public class Program2 {

	public static void main(String[] args) {
		Program2Fund fund = new Program2Fund();
		fund.buy();
		fund.buy();
		fund.sell();
	}
	
}
