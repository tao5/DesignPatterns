package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.println;

import java.util.ArrayList;
import java.util.List;

public class Program4Product {
	
	private List<String> productList = new ArrayList<String>();
	
	public void add(String product) {
		productList.add(product);
	}
	
	public void show() {
		for (String product : productList) {
			println(product);
		}
	}
	
}
