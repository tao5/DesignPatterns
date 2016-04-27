package com.ngu.pattern.c10.observer;

import static com.ngu.pattern.Utils.println;

public class Program3StockObserver extends Program3Observer {

	public Program3StockObserver(String name, Program3Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		if (subject != null) {
			if ("bossback".equals(subject.getAction())) {
				println(name + ", close stock go back to work");
			} else if ("boss".equals(subject.getAction())) {
				println(name + ", doing something");
			}
		}
	}

}
