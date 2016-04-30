package com.ngu.pattern.c12.state;
import static com.ngu.pattern.Utils.*;

public class Program1 {

	public static void main(String[] args) {
		int hour = 7;
		executeSchedule(hour);
		hour = 14;
		executeSchedule(hour);
		hour = 22;
		executeSchedule(hour);
	}
	
	private static void executeSchedule(int hour) {
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
