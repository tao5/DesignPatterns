package com.ngu.pattern.c10.observer;

public class Program4 {

	public static void main(String[] args) {
		
		Program4ConcreteSubject subject = new Program4ConcreteSubject("default status");
		Program4ConcreteObserver observer1 = new Program4ConcreteObserver("observer1", subject);
		subject.attach(observer1);
		subject.update();
		
		subject.setStatus("status b");
		subject.update();
		
	}
	
}
