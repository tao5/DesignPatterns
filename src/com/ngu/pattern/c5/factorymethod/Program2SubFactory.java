package com.ngu.pattern.c5.factorymethod;

public class Program2SubFactory implements Program2IFactory {

	@Override
	public Program1Operation createOperation() {
		return new Program1OperationSub();
	}

}
