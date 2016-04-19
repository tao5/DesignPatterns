package com.ngu.pattern;

public class Utils {
	
	public static void printWithSingleLine(String info) {
		System.out.print(info);
	}
	
	public static void printMessage(String info) {
		printWithSingleLine(info + "\r\n");
	}
	
	public static void printErrorMessage(String error) {
		printMessage("[error : " + error + "]");
	}
	
	public static void print(String info) {
		printWithSingleLine(info);
	}
	
	public static void println(String info) {
		printMessage(info);
	}
	
	public static boolean isNumber(String number) {
		try {
			Double.parseDouble(number);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
