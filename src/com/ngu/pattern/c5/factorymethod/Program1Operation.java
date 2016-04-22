package com.ngu.pattern.c5.factorymethod;
import static com.ngu.pattern.Utils.*;

abstract public class Program1Operation {
	
	abstract protected String getResult(String numberA, String numberB);
	
	protected boolean isError(String numberA, String numberB) {
		if (!isNumber(numberA)) {
			println("[error : input vaild number a plz.]");
			return true;
		}
		if (!isNumber(numberB)) {
			println("[error : input vaild number b plz.]");
			return true;
		}
		return false;
	}

}
