package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.*;

abstract public class Program3PersonBuilder {

	public Program3PersonBuilder(String name) {
		println(name);
	}
	
	abstract protected void buildHead();
	abstract protected void buildBody();
	abstract protected void buildEye();
	abstract protected void buildHand();
	abstract protected void buildLeg();
	
}
