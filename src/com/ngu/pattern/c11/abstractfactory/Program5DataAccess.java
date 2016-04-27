package com.ngu.pattern.c11.abstractfactory;

public class Program5DataAccess {
	
	public static Program2IUser creaetUser(String className) {
		Program2IUser user = null;
		try {
			//Class<Program2IUser> clazz = (Class<Program2IUser>) Class.forName(className);
			//user = clazz.newInstance();
			Class<?> clazz = Class.forName(className);
			user = (Program2IUser) clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return user;
	}

	public static Program3IDepartment createDepartment(String className) {
		Program3IDepartment department = null;
		try {
			Class<?> clazz = (Class<?>) Class.forName(className);
			department = (Program3IDepartment) clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return department;
	}
}
