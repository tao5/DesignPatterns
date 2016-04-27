package com.ngu.pattern.c10.observer;

import java.util.ArrayList;

public class Program1Secretary {

	private ArrayList<Program1StockObserver> observers = new ArrayList<Program1StockObserver>();
	private String aciton;
	
	public void attach(Program1StockObserver observer) {
		observers.add(observer);
	}
	
	public void nofity() {
		for (Program1StockObserver observer : observers) {
			observer.update();
		}
	}
	
	public String getAciton() {
		return aciton;
	}
	
	public void setAciton(String aciton) {
		this.aciton = aciton;
	}
	
}
