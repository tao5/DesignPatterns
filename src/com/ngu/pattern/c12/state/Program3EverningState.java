package com.ngu.pattern.c12.state;

import static com.ngu.pattern.Utils.println;

public class Program3EverningState extends Program3State {

	@Override
	protected void executeTask(Program3Work work) {
		if (work.getHour() < 21) {
			println("good everning");
		}else {
			work.setState(new Program3NightState());
			work.executeTask();
		}
	}

}
