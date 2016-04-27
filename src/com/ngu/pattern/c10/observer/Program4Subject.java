package com.ngu.pattern.c10.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Program4Subject {

	private List<Program4Observer> observers = new ArrayList<Program4Observer>();
	
	public void attach(Program4Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Program4Observer observer) {
		observers.remove(observer);
	}
	
	public void update() {
		for (Program4Observer observer : observers) {
			observer.update();
		}
	}
	
}
