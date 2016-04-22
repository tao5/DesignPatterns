package com.ngu.pattern.c4.proxy;

import static com.ngu.pattern.Utils.println;

public class Program3Pursuit implements Program3GiveGift {
	
	private Program1Girl girl;
	
	public Program3Pursuit(Program1Girl girl) {
		this.girl = girl;
	}
	
	public Program1Girl getGirl() {
		return girl;
	}

	@Override
	public void giveFlowers() {
		println(girl.getName() + " give you flowers");
	}

	@Override
	public void giveBook() {
		println(girl.getName() + " give you book");
	}

	@Override
	public void giveChocolate() {
		println(girl.getName() + " give you chocolate");
	}

}
