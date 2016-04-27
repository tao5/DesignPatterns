package com.ngu.pattern.c11.abstractfactory;

public class Program4DataAccess {
	
	public static Program2IUser creaetUser(String optionUser) {
		Program2IUser user = null;
		switch (optionUser) {
		case "sql":
			user = new Program2SqlserverUser();
			break;
		case "access":
			user = new Program2AccessUser();
			break;
		}
		return user;
	}

	public static Program3IDepartment createDepartment(String optionDepartment) {
		Program3IDepartment department = null;
		switch (optionDepartment) {
		case "sql":
			department = new Program3SqlserverDepartment();
			break;
		case "access":
			department = new Program3AccessDepartment();
			break;
		}
		return department;
	}

}
