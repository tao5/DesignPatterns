package com.ngu.pattern.c4.proxy;

import static com.ngu.pattern.Utils.println;

public class Program2Proxy {

	private Program1Girl girl;

	public Program2Proxy(Program1Girl girl) {
		this.girl = girl;
	}
	
	public Program1Girl getGirl() {
		return girl;
	}

	public void giveFlowers() {
		println(girl.getName() + " give you flowers");
	}

	public void giveBook() {
		println(girl.getName() + " give you book");
	}

	public void giveChocolate() {
		println(girl.getName() + " give you chocolate");
	}
	
	
}
