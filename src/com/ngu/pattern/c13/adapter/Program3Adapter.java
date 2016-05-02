package com.ngu.pattern.c13.adapter;

public class Program3Adapter extends Program3Tagret {

	private Program3Adaptee adaptee = new Program3Adaptee();
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}
	
}
