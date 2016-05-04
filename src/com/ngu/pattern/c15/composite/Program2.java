package com.ngu.pattern.c15.composite;

public class Program2 {
	
	public static void main(String[] args) {
		Program2Component root = new Program2Composite("root");
		root.add(new Program2Leaf("leaf 1"));
		root.add(new Program2Leaf("leaf 2"));

		Program2Component component = new Program2Composite("component X");
		component.add(new Program2Leaf("leaf a"));
		component.add(new Program2Leaf("leaf b"));
		root.add(component);
		
		Program2Component subComponent = new Program2Composite("component XY");
		subComponent.add(new Program2Leaf("leaf C"));
		subComponent.add(new Program2Leaf("leaf D"));
		component.add(subComponent);
		
		root.add(new Program2Leaf("leaf ee"));
		root.add(new Program2Leaf("leaf ff"));
		
		root.display(0);
		
	}
	
}
