package com.ngu.pattern.c9.builder;
import static com.ngu.pattern.Utils.*;

public class Program3ThinBuilder extends Program3PersonBuilder {

	public Program3ThinBuilder() {
		super("the thin man");
	}

	@Override
	protected void buildHead() {
		println("draw thin head");
	}

	@Override
	protected void buildBody() {
		println("draw thin body");
	}

	@Override
	protected void buildEye() {
		println("draw thin eye");
	}

	@Override
	protected void buildHand() {
		println("draw thin hand");
	}

	@Override
	protected void buildLeg() {
		println("draw thin leg");
	}

}
