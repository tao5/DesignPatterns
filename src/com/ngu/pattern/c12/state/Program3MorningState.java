package com.ngu.pattern.c12.state;

import static com.ngu.pattern.Utils.println;

public class Program3MorningState extends Program3State {

	@Override
	protected void executeTask(Program3Work work) {
		if (work.getHour() < 12) {
			println("good morning");
		}else {
			work.setState(new Program3AfternoonState());
			work.executeTask();
		}
	}

}
