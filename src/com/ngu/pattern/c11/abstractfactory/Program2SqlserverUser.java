package com.ngu.pattern.c11.abstractfactory;

import static com.ngu.pattern.Utils.println;

public class Program2SqlserverUser implements Program2IUser {

	@Override
	public void add(Program1User user) {
		println("add sql user, id : " + user.getId() + " , name : " + user.getName());
	}
	
	public Program1User getUser(String id) {
		println("get sql user...");
		return null;
	}

}
