package com.ngu.pattern.c3.decorator;
import static com.ngu.pattern.Utils.*;

public class Program1 {

	public static void main(String[] args) {
		Program1Person jack = new Program1Person("jack");
	
		println("at home");
		jack.wearJean();
		jack.wearShoes();
		jack.wearTShirts();
		jack.show();
	
		println("at school");
		jack.wearTShirts();
		jack.wearGlasses();
		jack.wearShoes();
		jack.wearHat();
		jack.wearJean();
		jack.show();
		
	}

}
