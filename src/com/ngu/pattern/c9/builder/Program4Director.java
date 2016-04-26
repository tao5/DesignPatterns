package com.ngu.pattern.c9.builder;

public class Program4Director {

	public void createProduct(Program4Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
	
}
