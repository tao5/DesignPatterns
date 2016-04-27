package com.ngu.pattern.c10.observer;
import static com.ngu.pattern.Utils.*;

public class Program1StockObserver {

	private Program1Secretary secretary;
	private String name;
	
	public Program1StockObserver(String name, Program1Secretary secretary) {
		this.secretary = secretary;
		this.name = name;
	}

	public void update() {
		if (secretary != null && "bossback".equals(secretary.getAciton())) {
			println(name + ", close stock go back to work");
		}
	}

}
