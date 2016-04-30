package com.ngu.pattern.c12.state;

public class Program2 {

	public static void main(String[] args) {
		Program2Work work = new Program2Work(3);
		work.executeTask();
		work.setHour(18);
		work.executeTask();
		work.setHour(23);
		work.executeTask();
	}

}
