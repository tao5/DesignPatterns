package com.ngu.pattern.c8.facade;
import static com.ngu.pattern.Utils.*;

public class Program1Stock1 implements Program1Deal {
	
	@Override
	public void buy() {
		println("buy stock1");
	}
	
	@Override
	public void sell() {
		println("sell stock1");
	}

}
