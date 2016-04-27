package com.ngu.pattern.c11.abstractfactory;


public class Program3AccessFactory implements Program3IFactory {

	@Override
	public Program2IUser createUser() {
		return new Program2AccessUser();
	}

	@Override
	public Program3IDepartment createDepartment() {
		return new Program3AccessDepartment();
	}

}
