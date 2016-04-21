package com.ngu.pattern.c3.decorator;
import static com.ngu.pattern.Utils.*;

public class Program3Person {

	private String name;
	
	public Program3Person (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void show() {
		print(name + " wore");
	}
}
