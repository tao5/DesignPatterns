package com.ngu.pattern.c12.state;

public class Program3Work {

	private int hour;
	private Program3State state;
	
	public Program3Work() {
		hour = 8;
		state = new Program3MorningState();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public Program3State getState() {
		return state;
	}
	
	public void setState(Program3State state) {
		this.state = state;
	}
	
	public void executeTask() {
		state.executeTask(this);
	}

}
