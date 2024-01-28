package com.dsa.beginners.basic.math.problem;

import javax.xml.stream.events.StartDocument;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckIfPalindrome checkIfPalindrome = new CheckIfPalindrome();
		String isPalindromeString =	checkIfPalindrome.optimizedAppproach(123321);
		System.out.println(isPalindromeString);
	}

	public String optimizedAppproach(int n) {

		char[] arrayNum = String.valueOf(n).toCharArray();
		int start = 0;
		int end = arrayNum.length-1;
		while(start<end) {

			if(arrayNum[start]!=arrayNum[end]) {
				return "No";
			}
			start++;
			end--;
		}
		return "Yes";
	}

}
