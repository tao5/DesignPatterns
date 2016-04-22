package com.ngu.pattern.c4.proxy;

/**
 * 在 Program3 的基础上扩展，之前代理的是"追求者"，现在代理的是"送礼的人"，扩大了代理范围
 * 试想这种场景：如果 Girl 的朋友或是父母想要通过 Proxy 给女孩送礼物，给她一个惊喜，改
 * 动后的代码，在这种情况下也是适用的，只要是实现了"送礼"接口的对象，都能通过代理类实现送
 * 礼需求。
 */
public class Program4 {

	public static void main(String[] args) {
		Program1Girl girl = new Program1Girl("rose");
		Program3GiveGift pursuit = new Program3Pursuit(girl);
		Program3GiveGift proxy = new Program4Proxy(pursuit);
		proxy.giveBook();
		proxy.giveChocolate();
		proxy.giveFlowers();
	}

}
