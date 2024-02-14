package com.java.practise.programs;

public class ReverseTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//elpoepolleh
		String string = "hellopeople";

		char[] charArray = string.toCharArray();
		int array[] = {3,1,4,5,7,1};
		int i=0;
		int j = string.length()-1;

		while (i<=j) {

			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		
		for(char char1 : charArray) {
			System.out.print(char1);
		}
		
		//is palindrome
		String string1 = "appay";
		char[] charArray1 = string1.toCharArray();

		i=0;
		j = string1.length()-1;
		int flag=0;
		while (i<=j) {

			if(charArray1[i]!=charArray1[j]) {
				flag=1;
				break;
			}
			i++;
			j--;
		}
		
		if(flag==0) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("no pal");
		}

		
	}

}
