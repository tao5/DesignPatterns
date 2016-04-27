package com.ngu.pattern.c10.observer;

public class Program3 {

	public static void main(String[] args) {
		
		Program3Subject subject1 = new Program3BossSubject();
		Program3Observer observer1 = new Program3StockObserver("jack", subject1);
		subject1.attach(observer1);
		subject1.setAction("boss");
		subject1.update();
		
		Program3Subject subject2 = new Program3BossSubject();
		Program3Observer observer2 = new Program3NBAObserver("rose", subject2);
		subject2.attach(observer2);
		subject2.setAction("bossback");
		subject2.update();
		
	}
	
}
