package com.ngu.pattern.c11.abstractfactory;
import static com.ngu.pattern.Utils.*;

public class Program3 {

	public static void main(String[] args) {
		
		Program3IFactory accessFactory = new Program3AccessFactory();
		
		Program2IUser accessUser = accessFactory.createUser();
		accessUser.add(new Program1User("1", "jack"));
		accessUser.getUser("1");
		
		Program3IDepartment accessDepartment = accessFactory.createDepartment();
		accessDepartment.add(new Program3Department("hr"));
		accessDepartment.getDepartment("hr");
		
		println("");
		
		Program3IFactory sqlFactory = new Program3SqlserverFactory();
		
		Program2IUser sqlUser = sqlFactory.createUser();
		sqlUser.add(new Program1User("2", "rose"));
		sqlUser.getUser("2");
		
		Program3IDepartment sqlDepartment = sqlFactory.createDepartment();
		sqlDepartment.add(new Program3Department("dev"));
		sqlDepartment.getDepartment("dev");
	}
	
}
