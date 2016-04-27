package com.ngu.pattern.c11.abstractfactory;
import static com.ngu.pattern.Utils.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Program5 {

	public static void main(String[] args) {
		
		Properties config = new Properties();
		FileInputStream fis = null;
		try {
			File file = new File("config.properties");
			if (!file.exists()) {
				file.createNewFile();
			}
			fis = new FileInputStream(file);
			config.load(fis);
			String user = config.getProperty("user");
			String department = config.getProperty("department");
			
			
			Program2IUser sqlUser = Program5DataAccess.creaetUser(user);
			sqlUser.add(new Program1User("1", "jack"));
			sqlUser.getUser("1");
			
			Program2IUser accessUser = Program5DataAccess.creaetUser(user);
			accessUser.add(new Program1User("2", "rose"));
			accessUser.getUser("2");
			
			println("");
			
			Program3IDepartment sqlDepartment = Program5DataAccess.createDepartment(department);
			sqlDepartment.add(new Program3Department("hr"));
			sqlDepartment.getDepartment("hr");
			
			Program3IDepartment accessDepartment = Program5DataAccess.createDepartment(department);
			accessDepartment.add(new Program3Department("dev"));
			accessDepartment.getDepartment("dev");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
