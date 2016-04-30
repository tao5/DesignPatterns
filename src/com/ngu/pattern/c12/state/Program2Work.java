package com.ngu.pattern.c12.state;

import static com.ngu.pattern.Utils.println;

public class Program2Work {

	private int hour;
	
	public Program2Work(int hour) {
		this.hour = hour;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void executeTask() {
		if (hour < 12) {
			println("good morning");
		} else if (hour < 17) {
			println("good afternoon");
		} else if (hour < 21) {
			println("good everning");
		} else {
			println("good night");
		}
	}

}
