package com.ngu.pattern.c13.adapter;

public class Program2 {

	public static void main(String[] args) {
		Program1Player forward = new Program1Forwards();
		forward.attack();
		Program1Player foreignCenter = new Program2Translator();
		foreignCenter.attack();
		Program1Player guard = new Program1Guards();
		guard.attack();
		guard.defense();
	}

}
