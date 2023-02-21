package com.jlc.labs.logical;

public class StringExample {

	public static void main(String[] args) {

		String str = "{<Hi uma Mahesh i am bangalpotregffgd fg dH>{";
		char ch[] = str.toCharArray();

		int temp = 1;
		for (int i = 0; i < ch.length; i++) {
			if (str.charAt(i) == str.charAt(str.length() - temp)) {
				System.out.println("true");
			}
			temp++;
			System.out.println(temp);
		}
	}

}
