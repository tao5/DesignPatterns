package com.ngu.pattern.c8.facade;
import static com.ngu.pattern.Utils.*;

public class Program1Stock3 implements Program1Deal {
	
	@Override
	public void buy() {
		println("buy stock3");
	}
	
	@Override
	public void sell() {
		println("sell stock3");
	}

}
