package com.ngu.pattern.c9.builder;

public class Program3PersonDirector {
	
	private Program3PersonBuilder builder;
	
	public Program3PersonDirector(Program3PersonBuilder builder) {
		this.builder = builder;
	}
	
	public void createPerson() {
		builder.buildHead();
		builder.buildBody();
		builder.buildEye();
		builder.buildHand();
		builder.buildLeg();
	}

}
