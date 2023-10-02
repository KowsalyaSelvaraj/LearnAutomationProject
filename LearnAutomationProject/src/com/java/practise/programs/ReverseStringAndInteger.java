package com.java.practise.programs;

import java.util.Scanner;

public class ReverseStringAndInteger {

	//Hello fam
	//maf olleH
	public void reverseASingleString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String for reversal");
		String string1 = scanner.nextLine();
		scanner.close();
		System.out.println(string1);
		String reversedString="";
		for(int i=string1.length()-1;i>=0;i--) {
			reversedString = reversedString + string1.charAt(i);
		}
		
		System.out.println(reversedString);
	}
	
	//Hello Blue Berry
	//yrreB eulB olleH
	public void reverseASingleStringusingChar() {
		String string1 = "Hello Blue Berry";
		System.out.println(string1);
		char[] characterArray = string1.toCharArray();
		String reversedString="";
		for(int i=characterArray.length-1;i>=0;i--) {
			reversedString = reversedString + characterArray[i];
		}
		
		System.out.println(reversedString);
	}
	
	//Hello Blue Berry
	//Berry Blue Hello 
	public void reverseWordsOrderInSentence() {
		String string1 = "Hello Blue Berry";
		System.out.println(string1);
		String[] stringArrayStrings = string1.split(" ");
		
		String reversedString="";
		for(int i=stringArrayStrings.length-1;i>=0;i--) {
			reversedString = reversedString + stringArrayStrings[i]+" ";
		}
		
		System.out.println(reversedString);
	}
	
	//Hello Blue Berry
	//olleH eulB yrreB 
	public void reverseEachWordsInSentenceWithoutChangingTheOrder() {
		String string1 = "Hello Blue Berry";
		System.out.println(string1);
		String[] stringArrayStrings = string1.split(" ");
		
		String reversedString="";
		String newString = "";
		for(int i=0;i<stringArrayStrings.length;i++) {
			
			for(int j = stringArrayStrings[i].length()-1;j>=0;j--) {
				reversedString = reversedString + stringArrayStrings[i].charAt(j);
			}
			newString = newString + reversedString + " ";
			reversedString = "";
		}
		
		System.out.println(newString);
	}
	
	
	//Hello Blue Berry
	//yrreB eulB olleH 
	public void reverseEachWordsAndItsOrderInASentence() {
		String string1 = "Hello Blue Berry";
		System.out.println(string1);
		String[] stringArrayStrings = string1.split(" ");
		
		String reversedString="";
		String newString = "";
		for(int i=stringArrayStrings.length-1;i>=0;i--) {
			
			for(int j = stringArrayStrings[i].length()-1;j>=0;j--) {
				reversedString = reversedString + stringArrayStrings[i].charAt(j);
			}
			newString = newString + reversedString + " ";
			reversedString = "";
		}
		
		System.out.println(newString);
	}
	
	//145823
    //328541

	public void reverseANumber() {
		int num1 = 145823;
		int rem = 0;
		int reversedNumber = 0;
		System.out.println(num1);
		while(num1>0) {
			rem = num1%10;
			num1 = num1/10;
			
			reversedNumber = reversedNumber*10 + rem;
		}
		
		System.out.println(reversedNumber);
	}
	
	
	
	public static void main(String[] args) {
		
		ReverseStringAndInteger reverseAString = new ReverseStringAndInteger();
		reverseAString.reverseASingleString();
		reverseAString.reverseASingleStringusingChar();
		reverseAString.reverseWordsOrderInSentence();
		reverseAString.reverseEachWordsInSentenceWithoutChangingTheOrder();
		reverseAString.reverseEachWordsAndItsOrderInASentence();
		reverseAString.reverseANumber();
	}
	
}
