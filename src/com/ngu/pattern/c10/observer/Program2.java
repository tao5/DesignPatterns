package com.ngu.pattern.c10.observer;

public class Program2 {

	public static void main(String[] args) {
		Program2Secretary secretary = new Program2Secretary();
		Program2Observer observer1 = new Program2StockObserver("jack" ,secretary);
		Program2Observer observer2 = new Program2NBAObserver("rose", secretary);
		secretary.attach(observer1);
		secretary.attach(observer2);
		secretary.setAction("bossback");
		secretary.nofity();
	}
	
}
