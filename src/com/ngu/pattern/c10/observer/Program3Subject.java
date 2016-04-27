package com.ngu.pattern.c10.observer;

import java.util.ArrayList;

abstract public class Program3Subject {
	
	protected ArrayList<Program3Observer> observers = new ArrayList<Program3Observer>();
	protected String action;
	
	protected void attach(Program3Observer observer) {
		observers.add(observer);
	}
	
	protected void detach(Program3Observer observer) {
		observers.remove(observer);
	}
	
	protected void update() {
		for (Program3Observer observer : observers) {
			observer.update();
		}
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
}
