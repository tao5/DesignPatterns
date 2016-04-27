package com.ngu.pattern.c10.observer;

import static com.ngu.pattern.Utils.println;

public class Program2StockObserver extends Program2Observer {

	public Program2StockObserver(String name, Program2Secretary secretary) {
		super(name, secretary);
	}

	@Override
	public void update() {
		if (secretary != null && "bossback".equals(secretary.getAction())) {
			println(name + ", close stock go back to work");
		}
	}

}
