package com.ngu.pattern.c11.abstractfactory;
import static com.ngu.pattern.Utils.*;

public class Program3AccessDepartment implements Program3IDepartment {

	@Override
	public void add(Program3Department department) {
		println("add access department : " + department.getName());
	}

	@Override
	public Program3Department getDepartment(String name) {
		println("get access department...");
		return null;
	}

}
