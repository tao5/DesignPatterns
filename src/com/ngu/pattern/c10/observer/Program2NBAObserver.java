package com.ngu.pattern.c10.observer;

import static com.ngu.pattern.Utils.println;

public class Program2NBAObserver extends Program2Observer {

	public Program2NBAObserver(String name, Program2Secretary secretary) {
		super(name, secretary);
	}

	@Override
	public void update() {
		if (secretary != null && "bossback".equals(secretary.getAction())) {
			println(name + ", close NBA go back to work");
		}
	}

}
