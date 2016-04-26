package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.*;

public class Program3 {

	public static void main(String[] args) {
		Program3FatBuilder fatBuilder = new Program3FatBuilder();
		Program3PersonDirector fatDirector = new Program3PersonDirector(fatBuilder);
		fatDirector.createPerson();
		
		println("");
		
		Program3ThinBuilder thinBuilder = new Program3ThinBuilder();
		Program3PersonDirector thinDirector = new Program3PersonDirector(thinBuilder);
		thinDirector.createPerson();
	}
	
}
