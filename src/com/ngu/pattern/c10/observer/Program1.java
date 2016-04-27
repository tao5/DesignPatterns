package com.ngu.pattern.c10.observer;

public class Program1 {

	public static void main(String[] args) {
		Program1Secretary secretary = new Program1Secretary();
		Program1StockObserver observer1 = new Program1StockObserver("jack" ,secretary);
		Program1StockObserver observer2 = new Program1StockObserver("rose", secretary);
		secretary.attach(observer1);
		secretary.attach(observer2);
		secretary.setAciton("bossback");
		secretary.nofity();
	}
	
}
