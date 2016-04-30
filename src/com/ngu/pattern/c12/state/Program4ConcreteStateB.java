package com.ngu.pattern.c12.state;

import static com.ngu.pattern.Utils.println;

public class Program4ConcreteStateB extends Program4State {

	@Override
	public void changeState(Program4Context context) {
		println("state b");
		context.setState(new Program4ConcreteStateA());
	}

}
