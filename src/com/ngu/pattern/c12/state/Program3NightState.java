package com.ngu.pattern.c12.state;

import static com.ngu.pattern.Utils.println;

public class Program3NightState extends Program3State {

	@Override
	protected void executeTask(Program3Work work) {
		println("good night");
	}

}
