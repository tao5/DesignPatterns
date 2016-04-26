package com.ngu.pattern.c9.builder;

public class Program4Builder1 extends Program4Builder {

	private Program4Product product = new Program4Product();
	
	@Override
	protected void buildPartA() {
		product.add("part A");
	}

	@Override
	protected void buildPartB() {
		product.add("part B");
	}

	@Override
	protected Program4Product getResult() {
		return product;
	}

}
