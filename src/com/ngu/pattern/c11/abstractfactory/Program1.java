package com.ngu.pattern.c11.abstractfactory;

/**
 * Program1 not recommend, abandon
 * Program2 工厂方法
 * Program3 抽象工厂
 * Program4 简单工厂 + 抽象工厂
 * Program5 简单工厂 + 抽象工厂 + 反射 + 配置文件
 */
public class Program1 {

	public static void main(String[] args) {
		Program1User user = new Program1User("1", "jack");
		Program1SqlserverUser sqlserverUser = new Program1SqlserverUser();
		sqlserverUser.add(user);
		sqlserverUser.getUser("1");
	}
	
}
