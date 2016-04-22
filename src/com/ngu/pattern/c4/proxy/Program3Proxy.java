package com.ngu.pattern.c4.proxy;

public class Program3Proxy implements Program3GiveGift {

	private Program3Pursuit pursuit;
	
	public Program3Proxy(Program3Pursuit prusuit) {
		this.pursuit = prusuit;
	}
	
	@Override
	public void giveFlowers() {
		if (pursuit != null) {
			pursuit.giveFlowers();
		}
	}

	@Override
	public void giveBook() {
		if (pursuit != null) {
			pursuit.giveBook();
		}
	}

	@Override
	public void giveChocolate() {
		if (pursuit != null) {
			pursuit.giveChocolate();
		}
	}

}
