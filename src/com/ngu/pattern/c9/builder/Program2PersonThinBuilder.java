package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.*;

public class Program2PersonThinBuilder {

	public Program2PersonThinBuilder() {
		println("the thin man");
	}
	
	public void build() {
		println("draw thin head");
		println("draw thin body");
		println("draw thin eye");
		println("draw thin hand");
		println("draw thin leg");
	}
	
}
