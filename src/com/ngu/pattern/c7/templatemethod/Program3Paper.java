package com.ngu.pattern.c7.templatemethod;
import static com.ngu.pattern.Utils.*;

abstract public class Program3Paper {
	
	public void subject1() {
		println("question1");
		println("answer is "+answer1());
	}
	
	public void subject2() {
		println("question2");
		println("answer is "+answer2());
	}
	
	public void subject3() {
		println("question2");
		println("answer is "+answer3());
	}
	
	abstract protected String answer1();

	abstract protected String answer2();

	abstract protected String answer3();

}
