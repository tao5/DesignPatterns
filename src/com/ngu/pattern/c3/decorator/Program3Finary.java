package com.ngu.pattern.c3.decorator;

public abstract class Program3Finary extends Program3Person {

	protected Program3Person person;

	public Program3Finary() {
		super("");
	}
	
	public void setParent(Program3Person person) {
		this.person = person;
	}

	@Override
	public void show() {
		if (person != null) {
			person.show();
		}
	}

}
