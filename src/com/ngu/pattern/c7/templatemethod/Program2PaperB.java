package com.ngu.pattern.c7.templatemethod;
import static com.ngu.pattern.Utils.*;

public class Program2PaperB extends Program2Paper {
	
	public void subject1() {
		super.subject1();
		println("answer is a");
	}
	
	public void subject2() {
		super.subject2();
		println("answer is c");
	}
	
	public void subject3() {
		super.subject3();
		println("answer is b");
	}

}
