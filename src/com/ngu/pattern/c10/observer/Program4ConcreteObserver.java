package com.ngu.pattern.c10.observer;
import static com.ngu.pattern.Utils.*;

public class Program4ConcreteObserver extends Program4Observer {
	
	private Program4ConcreteSubject subject;
	private String name;
	
	public Program4ConcreteObserver(String name, Program4ConcreteSubject subject) {
		this.subject = subject;
		this.name = name;
	}
	

	@Override
	public void update() {
		if (subject != null) {
			println(name + ", subject status change : " + subject.getStatus());
		}
	}

}
