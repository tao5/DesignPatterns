package com.ngu.pattern.c15.composite;

import java.util.ArrayList;
import java.util.List;

public class Program1ConcreteCompany extends Program1Company{

	private List<Program1Company> companys;
	
	public Program1ConcreteCompany(String name) {
		super(name);
		companys = new ArrayList<Program1Company>();
	}

	@Override
	protected void add(Program1Company company) {
		companys.add(company);	
	}

	@Override
	protected void remove(Program1Company company) {
		companys.remove(company);
	}

	@Override
	protected void diaplay(int depth) {
		printInfo(depth);
		for (Program1Company company : companys) {
			company.diaplay(depth + 1);
		}
	}

	@Override
	protected void execute() {
		for (Program1Company company : companys) {
			company.execute();
		}
	}
	
}
