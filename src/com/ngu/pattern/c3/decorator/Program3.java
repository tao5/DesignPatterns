package com.ngu.pattern.c3.decorator;

import static com.ngu.pattern.Utils.println;

public class Program3 {

	public static void main(String[] args) {
		Program3Person jack = new Program3Person("jack");
		Program3FinaryTShirt tshirt = new Program3FinaryTShirt();
		Program3FinaryHat hat = new Program3FinaryHat();
		Program3FinaryShoes shoes = new Program3FinaryShoes();
		Program3FinaryJean jean = new Program3FinaryJean();
		Program3FinaryGlasses glasses = new Program3FinaryGlasses();
		
		println("at home");
		tshirt.setParent(jack);
		shoes.setParent(tshirt);
		jean.setParent(shoes);
		jean.show();

		println("");
		
		println("at school");
		jean.setParent(jack);
		hat.setParent(jean);
		shoes.setParent(hat);
		glasses.setParent(shoes);
		tshirt.setParent(glasses);
		tshirt.show();
	}
	
}
