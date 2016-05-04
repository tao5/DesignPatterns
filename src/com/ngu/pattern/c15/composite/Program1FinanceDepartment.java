package com.ngu.pattern.c15.composite;
import static com.ngu.pattern.Utils.println;

public class Program1FinanceDepartment extends Program1Company {

	public Program1FinanceDepartment(String name) {
		super(name);
	}

	@Override
	protected void add(Program1Company company) {
	}

	@Override
	protected void remove(Program1Company company) {
	}

	@Override
	protected void diaplay(int depth) {
		printInfo(depth);
	}

	@Override
	protected void execute() {
		println(name + "...finance work");
	}

}
