package com.java.practise.programs;

public class D60_PrintCharByGivenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input "a3b2c5";
		//output aaabbccccc

		String string = "a3b2c5";
		String newString = "";
		for(int i=0;i<string.length();i++) {
			if(Character.isDigit(string.charAt(i))) {
				int count = Character.getNumericValue(string.charAt(i));
				for(int j=0;j<count;j++) {
					newString = newString + string.charAt(i-1);
				}
			}
		} 

		System.out.println(newString);

		//input aaabbccccc
		//output a3b2c5

		String string1 = "aaabbcccccdde";
		String newString1 = "";
		char repeated,char1;
		repeated = string1.charAt(0);
		int	count=0;

		int lengthString = string1.length();
		int number = 0;
		while(number<lengthString) {
			
			char1 = string1.charAt(number);
			count=0;
		//	System.out.println(char1 + "and  "+number);
			while(number<lengthString && char1==string1.charAt(number)) {
				count++;
				number++;
			}
			newString1 = newString1 + char1 + String.valueOf(count);
		//	System.out.println(newString1);
		}
	
		System.out.println(newString1);
	}

}
