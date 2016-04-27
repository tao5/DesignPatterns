package com.ngu.pattern.c10.observer;

abstract public class Program2Observer {

	protected Program2Secretary secretary;
	protected String name;

	public Program2Observer(String name, Program2Secretary secretary) {
		this.secretary = secretary;
		this.name = name;
	}

	abstract public void update();

}
