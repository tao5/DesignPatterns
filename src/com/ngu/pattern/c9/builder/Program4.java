package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.*;

public class Program4 {

	public static void main(String[] args) {
		Program4Director director = new Program4Director();

		Program4Builder1 builder1 = new Program4Builder1();
		director.createProduct(builder1);
		Program4Product product1 = builder1.getResult();
		product1.show();

		println("");
		
		Program4Builder2 builder2 = new Program4Builder2();
		director.createProduct(builder2);
		Program4Product product2 = builder2.getResult();
		product2.show();
	}
	
}
