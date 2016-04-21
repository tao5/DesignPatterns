package com.ngu.pattern.c3.decorator;
import static com.ngu.pattern.Utils.*;

public class Program2Person {

	private String name;
	
	public Program2Person (String name) {
		this.name = name;
	}
	
	public void show() {
		println(name + " wore");
	}
}
