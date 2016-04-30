package com.ngu.pattern.c12.state;

import static com.ngu.pattern.Utils.println;

public class Program3AfternoonState extends Program3State {

	@Override
	protected void executeTask(Program3Work work) {
		if (work.getHour() < 17) {
			println("good afternoon");
		} else {
			work.setState(new Program3EverningState());
			work.executeTask();
		}
	}

}
