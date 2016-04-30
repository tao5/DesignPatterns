package com.ngu.pattern.c12.state;

public class Program4Context {
	
	private Program4State state;
	public Program4Context(Program4State state) {
		this.state = state;
	}
	
	public Program4State getState() {
		return state;
	}
	
	public void setState(Program4State state) {
		this.state = state;
	}
	
	public void request() {
		state.changeState(this);
	}

}
