package com.java.practise.programs;

public class CountNoOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String wordString = "aabbbcdddd";
		String countString ="";
		char[] charArray = wordString.toCharArray();
		int count=0;
		
		for(int i=0;i<charArray.length;i++) {

			char oneLetter = charArray[i];
			System.out.println(oneLetter + " one letter");
			
			System.out.println("condition 1 "+(i<charArray.length));
			System.out.println("condition 2 "+(oneLetter==charArray[i]));			
			while(i<charArray.length && oneLetter==charArray[i]) {
				
				count++;
				i++;
			}
			i--;
			countString = countString + oneLetter + String.valueOf(count);
			count=0;
		}
		
		System.out.println(countString);
	}

}
