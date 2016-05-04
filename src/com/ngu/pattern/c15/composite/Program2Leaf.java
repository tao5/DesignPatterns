package com.ngu.pattern.c15.composite;

public class Program2Leaf extends Program2Component {

	public Program2Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Program2Component component) {
	}

	@Override
	public void remove(Program2Component component) {
	}

	@Override
	public void display(int depth) {
		printInfo(depth);
	}

}
