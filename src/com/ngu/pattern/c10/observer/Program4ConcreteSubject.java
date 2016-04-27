package com.ngu.pattern.c10.observer;

public class Program4ConcreteSubject extends Program4Subject {

	private String status;
	
	public Program4ConcreteSubject(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
