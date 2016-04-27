package com.ngu.pattern.c11.abstractfactory;


public class Program2AccessFactory implements Program2IFactory {

	@Override
	public Program2IUser createUser() {
		return new Program2AccessUser();
	}

}
