package com.jlc.labs.logical;

public class StringReverse {

	public static void main(String[] args) {

		String str = "mahesh";

		char ch[] = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

}
