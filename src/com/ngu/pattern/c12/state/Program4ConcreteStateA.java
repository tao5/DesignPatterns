package com.ngu.pattern.c12.state;
import static com.ngu.pattern.Utils.*;

public class Program4ConcreteStateA extends Program4State {

	@Override
	public void changeState(Program4Context context) {
		println("state a");
		context.setState(new Program4ConcreteStateB());
	}

}
