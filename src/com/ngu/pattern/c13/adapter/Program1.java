package com.ngu.pattern.c13.adapter;

/**
 * 需求：模拟本国球员在不懂外语的情况下，在国外打球的情景
 * 
 * Program1：普通球员打球，通用攻击和防守方法：attack / defense [Player]，不通类型的球员 [Forwards / Center / Guards]，各自做具体实现
 * Program2：外籍球员打球，因为语言不通，并不具备上述方法，但有特有的攻击和防守方法：myAttack / myDefense [ForeignPlayer]
 * 于是在此基础上，给外籍球员配备一个翻译 [Translator]，来做"适配"。
 * Program3：适配器模式，Target 是客户期待的接口（对应上文的 Player），Adaptee 是需要适配的类（对应上文的 ForeignPlayer） 
 * Adapter 是适配器（对应上文的 Translator）负责将 Adaptee 适配成 Target。
 */
public class Program1 {

	public static void main(String[] args) {
		Program1Player forward = new Program1Forwards();
		forward.attack();
		Program1Player center = new Program1Center();
		center.attack();
		Program1Player guard = new Program1Guards();
		guard.attack();
		guard.defense();
	}

}
