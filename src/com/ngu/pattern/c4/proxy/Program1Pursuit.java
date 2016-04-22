package com.ngu.pattern.c4.proxy;

import static com.ngu.pattern.Utils.*;

public class Program1Pursuit {

	public Program1Girl girl;

	public Program1Pursuit(Program1Girl girl) {
		this.girl = girl;
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
