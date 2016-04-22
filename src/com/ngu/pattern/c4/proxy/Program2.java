package com.ngu.pattern.c4.proxy;

public class Program2 {

	public static void main(String[] args) {
		Program1Girl girl = new Program1Girl("rose");
		Program2Proxy proxy = new Program2Proxy(girl);
		proxy.giveBook();
		proxy.giveChocolate();
		proxy.giveFlowers();
	}

}
