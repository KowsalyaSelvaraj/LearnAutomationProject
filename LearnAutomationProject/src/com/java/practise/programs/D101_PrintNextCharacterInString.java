package com.java.practise.programs;

import java.util.Scanner;

public class D101_PrintNextCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String valueString = scanner.nextLine();
		String outputString="";
		// input : hello
		// output : ifmmp

		for(int i=0;i<valueString.length();i++) {
			char letter = valueString.charAt(i);

			outputString = outputString + (++letter);
		}

		System.out.println(outputString);

		// input : "Hello chennai"
		// output : Gdkknbgdmm`h
		String outputString1="";
		String vaString = "Hello chennai";
		for(int i=0;i<vaString.length();i++) {
			char letter = vaString.charAt(i);

			outputString1 = outputString1 + (--letter);
		}

		System.out.println(outputString1);
	}

}
