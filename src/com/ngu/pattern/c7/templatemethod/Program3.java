package com.ngu.pattern.c7.templatemethod;
import static com.ngu.pattern.Utils.*;

public class Program3 {

	public static void main(String[] args) {
		Program3PaperA paperA = new Program3PaperA();
		paperA.subject1();
		paperA.subject2();
		paperA.subject3();
		
		println("");
		
		Program3PaperB paperB = new Program3PaperB();
		paperB.subject1();
		paperB.subject2();
		paperB.subject3();
	}
	
}
