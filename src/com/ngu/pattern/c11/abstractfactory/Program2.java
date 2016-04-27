package com.ngu.pattern.c11.abstractfactory;

public class Program2 {

	public static void main(String[] args) {
		Program2IFactory accessFactory = new Program2AccessFactory();
		Program2IUser accessUser = accessFactory.createUser();
		accessUser.add(new Program1User("1", "jack"));
		accessUser.getUser("1");
		
		Program2IFactory sqlFactory = new Program2SqlserverFactory();
		Program2IUser sqlUser = sqlFactory.createUser();
		sqlUser.add(new Program1User("2", "rose"));
		sqlUser.getUser("2");
	}
	
}
