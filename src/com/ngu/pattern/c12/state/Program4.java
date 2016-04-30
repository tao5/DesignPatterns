package com.ngu.pattern.c12.state;

public class Program4 {

	public static void main(String[] args) {
		Program4Context context = new Program4Context(new Program4ConcreteStateA());
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
	}

}
