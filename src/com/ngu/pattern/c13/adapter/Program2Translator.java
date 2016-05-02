package com.ngu.pattern.c13.adapter;

public class Program2Translator extends Program1Player {

	private Program2ForeignPlayer foreignCenter;
	
	public Program2Translator() {
		super("foreign player");
		foreignCenter = new Program2ForeignPlayer(name);
	}

	@Override
	public void attack() {
		foreignCenter.myAttack();
	}

	@Override
	public void defense() {
		foreignCenter.myDefense();
	}

}
