package com.ngu.pattern.c8.facade;

public class Program2Fund implements Program1Deal {

	private Program1Deal stock1;
	private Program1Deal stock2;
	private Program1Deal stock3;
	
	public Program2Fund() {
		stock1 = new Program1Stock1();
		stock2 = new Program1Stock2();
		stock3 = new Program1Stock3();
	}
	
	@Override
	public void buy() {
		stock1.buy();
		stock2.buy();
		stock3.buy();
		stock3.buy();
	}

	@Override
	public void sell() {
		stock2.sell();
		stock1.sell();
	}

}
