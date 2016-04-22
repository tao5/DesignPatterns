package com.ngu.pattern.c4.proxy;

public class Program3 {

	public static void main(String[] args) {
		Program1Girl girl = new Program1Girl("rose");
		Program3Pursuit pursuit = new Program3Pursuit(girl);
		Program3Proxy proxy = new Program3Proxy(pursuit);
		proxy.giveBook();
		proxy.giveChocolate();
		proxy.giveFlowers();
	}

}
