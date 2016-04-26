package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.*;

public class Program2 {

	public static void main(String[] args) {
		Program2PersonFatBuilder fatBuilder = new Program2PersonFatBuilder();
		fatBuilder.build();

		println("");
		
		Program2PersonThinBuilder thinBuilder = new Program2PersonThinBuilder();
		thinBuilder.build();
	}
	
}
