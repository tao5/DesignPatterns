package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.*;

public class Program3FatBuilder extends Program3PersonBuilder {

	public Program3FatBuilder() {
		super("the fat man");
	}

	@Override
	protected void buildHead() {
		println("draw fat head");
	}

	@Override
	protected void buildBody() {
		println("draw fat body");
	}

	@Override
	protected void buildEye() {
		println("draw fat eye");
	}

	@Override
	protected void buildHand() {
		println("draw fat hand");
	}

	@Override
	protected void buildLeg() {
		println("draw fat leg");
	}

}
