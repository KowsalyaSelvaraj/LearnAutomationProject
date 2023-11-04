package com.java.practise.programs;

import java.util.Iterator;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nameString = "John";
		String nameString2 = new String("John");
		if(nameString==nameString2) {
			System.out.println("ok");
		}else {
			System.out.println("not ok");
		}


		String name1 = "my..,dear..,students";
		String[] stringArrayStrings = name1.split("..,");

		for(String string : stringArrayStrings) {
			System.out.println(string);
		}


		StringBuffer nameBuffer = new StringBuffer();
		nameBuffer.append("helloteam");

		char[] characterArray = nameBuffer.toString().toCharArray();
		nameBuffer.charAt(0);

		for(int i=0;i<nameBuffer.length();i++) {
			nameBuffer.charAt(i);

			nameBuffer.append("itsfine");
		}

		StringBuilder nameBuilder = new StringBuilder();
		nameBuilder.append("helloteam");

		char[] characterArray1 = nameBuilder.toString().toCharArray();
		nameBuffer.charAt(0);

		for(int i=0;i<nameBuilder.length();i++) {
			System.out.println(	nameBuilder.charAt(i));
			nameBuilder.append("itsfine");
		}
	}

}
