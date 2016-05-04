package com.ngu.pattern.c15.composite;

import static com.ngu.pattern.Utils.println;

public abstract class Program2Component {

	protected String name;

	public Program2Component(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Program2Component component);
	public abstract void remove(Program2Component component);
	public abstract void display(int depth);
	
	protected void printInfo(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("---");
		}
		sb.append(name);
		println(sb.toString());
	}
	
}
