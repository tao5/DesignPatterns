package com.ngu.pattern.c3.decorator;

import static com.ngu.pattern.Utils.print;

public class Program3FinaryTShirt extends Program3Finary {

	@Override
	public void show() {
		print("tshirt ");
		person.show();
	}

}
