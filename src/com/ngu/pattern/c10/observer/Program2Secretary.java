package com.ngu.pattern.c10.observer;

import java.util.ArrayList;

public class Program2Secretary {

	private ArrayList<Program2Observer> observers = new ArrayList<Program2Observer>();
	private String action;
	
	public void attach(Program2Observer observer) {
		observers.add(observer);
	}
	
	public void nofity() {
		for (Program2Observer observer : observers) {
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
