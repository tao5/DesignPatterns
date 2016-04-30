package com.ngu.pattern.c12.state;

public class Program3 {

	public static void main(String[] args) {
		Program3Work work = new Program3Work();
		work.executeTask();
		work.setHour(7);
		work.executeTask();
		work.setHour(18);
		work.executeTask();
		work.setHour(23);
		work.executeTask();
	}

}
