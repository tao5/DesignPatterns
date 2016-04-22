package com.ngu.pattern.c4.proxy;

/**
 * 需求：害羞的最求者通过中间人送女孩礼物
 * 
 * Program1，没有代理的代码：追求者直接送女孩礼物，追求者因为不认识女孩，不能直接送礼物，这种写法有误
 * Program2，只有代理的代码，忽略了追求者的存在，并且并非是代理要追女孩，这种写法也不可行
 * Program3，代理模式，由 Proxy 替(代理) Pursuit 给 Girl 送礼物
 */
public class Program1 {

	public static void main(String[] args) {
		Program1Girl girl = new Program1Girl("beauty");
		Program1Pursuit pursuit = new Program1Pursuit(girl);
		pursuit.giveBook();
		pursuit.giveChocolate();
		pursuit.giveFlowers();
	}

}
