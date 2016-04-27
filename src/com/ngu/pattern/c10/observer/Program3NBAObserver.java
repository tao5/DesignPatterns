package com.ngu.pattern.c10.observer;

import static com.ngu.pattern.Utils.println;

public class Program3NBAObserver extends Program3Observer {

	public Program3NBAObserver(String name, Program3Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		if (subject != null) {
			if ("bossback".equals(subject.getAction())) {
				println(name + ", close NBA go back to work");
			} else if ("boss".equals(subject.getAction())) {
				println(name + ", doing something");
			}
		}
	}

}
