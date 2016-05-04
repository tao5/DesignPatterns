package com.ngu.pattern.c15.composite;

import static com.ngu.pattern.Utils.println;

public abstract class Program1Company {

	protected String name;

	public Program1Company(String name) {
		super();
		this.name = name;
	}
	
	protected abstract void add(Program1Company company);
	protected abstract void remove(Program1Company company);
	protected abstract void diaplay(int depth);
	protected abstract void execute();
	
	protected void printInfo(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("---");
		}
		sb.append(name);
		println(sb.toString());
	}
}
