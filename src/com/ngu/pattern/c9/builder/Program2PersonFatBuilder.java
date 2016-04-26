package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.*;

public class Program2PersonFatBuilder {

	public Program2PersonFatBuilder() {
		println("the fat man");
	}
	
	public void build() {
		println("draw fat head");
		println("draw fat body");
		println("draw fat eye");
		println("draw fat hand");
		println("draw fat leg");
	}
	
}
