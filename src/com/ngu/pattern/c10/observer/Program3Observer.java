package com.ngu.pattern.c10.observer;

abstract public class Program3Observer {

	protected Program3Subject subject;
	protected String name;

	public Program3Observer(String name, Program3Subject subject) {
		this.subject = subject;
		this.name = name;
	}

	abstract public void update();

}
