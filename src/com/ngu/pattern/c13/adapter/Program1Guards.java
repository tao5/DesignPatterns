package com.ngu.pattern.c13.adapter;
import static com.ngu.pattern.Utils.*;

public class Program1Guards extends Program1Player {

	public Program1Guards() {
		super("guards");
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
