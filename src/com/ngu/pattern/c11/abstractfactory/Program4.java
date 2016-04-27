package com.ngu.pattern.c11.abstractfactory;
import static com.ngu.pattern.Utils.*;

public class Program4 {

	public static void main(String[] args) {
		
		Program2IUser sqlUser = Program4DataAccess.creaetUser("sql");
		sqlUser.add(new Program1User("1", "jack"));
		sqlUser.getUser("1");
		
		Program2IUser accessUser = Program4DataAccess.creaetUser("access");
		accessUser.add(new Program1User("2", "rose"));
		accessUser.getUser("2");
		
		println("");
		
		Program3IDepartment sqlDepartment = Program4DataAccess.createDepartment("sql");
		sqlDepartment.add(new Program3Department("hr"));
		sqlDepartment.getDepartment("hr");
		
		Program3IDepartment accessDepartment = Program4DataAccess.createDepartment("access");
		accessDepartment.add(new Program3Department("dev"));
		accessDepartment.getDepartment("dev");
		
	}
	
}
