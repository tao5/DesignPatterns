package com.ngu.pattern.c7.templatemethod;
import static com.ngu.pattern.Utils.*;

public class Program1 {

	public static void main(String[] args) {
		Program1PaperA paperA = new Program1PaperA();
		paperA.subject1();
		paperA.subject2();
		paperA.subject3();
		
		println("");
		
		Program1PaperB paperB = new Program1PaperB();
		paperB.subject1();
		paperB.subject2();
		paperB.subject3();
		
	}
	
}
