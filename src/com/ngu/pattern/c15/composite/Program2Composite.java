package com.ngu.pattern.c15.composite;

import java.util.ArrayList;
import java.util.List;

public class Program2Composite extends Program2Component {

	private List<Program2Component> components; 
	
	public Program2Composite(String name) {
		super(name);
		components = new ArrayList<Program2Component>();
	}

	@Override
	public void add(Program2Component component) {
		components.add(component);
	}

	@Override
	public void remove(Program2Component component) {
		components.remove(component);
	}

	@Override
	public void display(int depth) {
		printInfo(depth);
		for (Program2Component component : components) {
			component.display(depth + 1);
		}
	}

}
