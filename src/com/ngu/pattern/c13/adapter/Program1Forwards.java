package com.ngu.pattern.c13.adapter;
import static com.ngu.pattern.Utils.*;

public class Program1Forwards extends Program1Player {

	public Program1Forwards() {
		super("forwards");
	}

	@Override
	public void attack() {
		println(name + "...accack");
	}

	@Override
	public void defense() {
		println(name + "...defense");
	}

}
