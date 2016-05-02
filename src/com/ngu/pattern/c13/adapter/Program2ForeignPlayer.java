package com.ngu.pattern.c13.adapter;
import static com.ngu.pattern.Utils.*;

public class Program2ForeignPlayer {
	
	private String name;
	
	public Program2ForeignPlayer(String name) {
		super();
		this.name = name;
	}

	public void myAttack() {
		println(name + "...accack");
	}

	public void myDefense() {
		println(name + "...defense");
	}

}
