package com.ngu.pattern.c11.abstractfactory;
import static com.ngu.pattern.Utils.*;

public class Program1SqlserverUser {

	public void add(Program1User user) {
		println("add user in sql, id : " + user.getId() + " , name : " + user.getName());
	}
	
	public Program1User getUser(String id) {
		println("get user...");
		return null;
	}
	
}
