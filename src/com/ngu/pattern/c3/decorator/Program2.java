package com.ngu.pattern.c3.decorator;

import static com.ngu.pattern.Utils.println;

public class Program2 {

	public static void main(String[] args) {
		Program2Person zhangsan = new Program2Person("jack");
		Program2FinaryHat hat = new Program2FinaryHat();
		Program2FinaryJean jean = new Program2FinaryJean();
		Program2FinaryShoes shoes = new Program2FinaryShoes();
		Program2FinaryGlasses glasses = new Program2FinaryGlasses();
		Program2FinaryTShirt tshirt = new Program2FinaryTShirt();
		
		println("at home");
		jean.show();
		shoes.show();
		tshirt.show();
		zhangsan.show();
		
		println("at school");
		tshirt.show();
		glasses.show();
		shoes.show();
		hat.show();
		jean.show();
		zhangsan.show();
		
		
	}
	
}
