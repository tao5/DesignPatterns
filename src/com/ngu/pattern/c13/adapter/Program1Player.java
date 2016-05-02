package com.ngu.pattern.c13.adapter;

public abstract class Program1Player {

	protected String name;
	
	public Program1Player(String name) {
		super();
		this.name = name;
	}
	
	public abstract void attack();
	public abstract void defense();
	
}
