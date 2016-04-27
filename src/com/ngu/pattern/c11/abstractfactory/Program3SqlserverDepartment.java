package com.ngu.pattern.c11.abstractfactory;
import static com.ngu.pattern.Utils.*;

public class Program3SqlserverDepartment implements Program3IDepartment {

	@Override
	public void add(Program3Department department) {
		println("add sql department : " + department.getName());
	}

	@Override
	public Program3Department getDepartment(String name) {
		println("get sql department...");
		return null;
	}

}
