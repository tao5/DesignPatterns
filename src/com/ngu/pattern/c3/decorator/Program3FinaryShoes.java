package com.ngu.pattern.c3.decorator;

import static com.ngu.pattern.Utils.print;

public class Program3FinaryShoes extends Program3Finary {

	@Override
	public void show() {
		print("shoes ");
		person.show();
	}

}
