package com.ngu.pattern.c7.templatemethod;
import static com.ngu.pattern.Utils.*;

public class Program2 {

	public static void main(String[] args) {
		Program2PaperA paperA = new Program2PaperA();
		paperA.subject1();
		paperA.subject2();
		paperA.subject3();
		
		println("");
		
		Program2PaperB paperB = new Program2PaperB();
		paperB.subject1();
		paperB.subject2();
		paperB.subject3();
	}
	
}
