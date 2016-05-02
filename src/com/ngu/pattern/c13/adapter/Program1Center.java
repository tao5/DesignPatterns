package com.ngu.pattern.c13.adapter;
import static com.ngu.pattern.Utils.*;

public class Program1Center extends Program1Player {

	public Program1Center() {
		super("center");
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
