package com.ngu.pattern.c3.decorator;
import static com.ngu.pattern.Utils.*;

public class Program1Person {

	private String name;
	
	public Program1Person (String name) {
		this.name = name;
	}
	
	public void wearTShirts() {
		print("tshirt ");
	}
	
	public void wearShoes() {
		print("shoes ");
	}
	
	public void wearJean() {
		print("jean ");
	}
	
	public void wearHat() {
		print("hat ");
	}
	
	public void wearGlasses() {
		print("glasses ");
	}
	
	public void show() {
		println(name + " wore");
	}
	
}