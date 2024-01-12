package com.java.practise.programs;

import java.awt.AlphaComposite;
import java.util.Iterator;

public class PrintAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] apha = new char[26];
		int j=0;
		for(char i='a';i<='z';i++) {
			System.out.print(i);
			apha[j]=i;
			j++;
		}
		String string = "123";
		Integer.parseInt(string);

		int h=4589;
		String.valueOf(h);
		String string1 = "Hello";
		String newString="";
		for(int i=0;i<string1.length();i++) {
			char val =	string1.charAt(i);
			newString = newString + (++val);
		}

		System.out.println("\n"+newString);
		
		String valString = "sssbbbb";
		
		int count=0;
		String stringnew1="";
		for(int i=0;i<valString.length();) {
			
			char variable = valString.charAt(i);
			int ivalue = i;
			while(variable==valString.charAt(ivalue) && ivalue<valString.length()) {
				ivalue++;
				count = count + 1;
			}
			stringnew1 = stringnew1 + valString.charAt(i)+count;
			count=0;
			i=ivalue;
		}
		
		System.out.println("\n"+stringnew1);
		
	}

}
