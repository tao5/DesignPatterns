package com.ngu.pattern.c8.facade;

/**
 * 外观模式，又称门面模式
 * 以买股票和买基金操作的复杂度为例演示外观模式
 * 
 * Program1 传统的炒股模式，股民需要了解自选股，买入卖出
 * Program2 不买股票，改买基金，只需关注所买基金的涨跌
 */
public class Program1 {

	public static void main(String[] args) {
		Program1Deal stock1 = new Program1Stock1();
		Program1Deal stock2 = new Program1Stock2();
		Program1Deal stock3 = new Program1Stock3();
	
		stock1.buy();
		stock2.buy();
		stock3.buy();
		stock3.buy();

		stock1.sell();
		stock1.sell();
		stock2.sell();
		
	}
	
}
