package coding.challenge.hundreddays;

import java.util.ArrayList;
import java.util.Arrays;

//Java Program to Reverse Vowels of a String.
//
//
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//Example:
//
//Input: s = "hello"
//Output: "holle"

public class D38_ReverseVowelInString {

	public static void main(String[] args) {
		String string = "ahiwoke";
		D38_ReverseVowelInString d38_ReverseVowelInString = new D38_ReverseVowelInString();
		String reverseString = d38_ReverseVowelInString.reverseVowels(string);
		System.out.println(reverseString);

	}

	public String reverseVowels(String string) {
		int i=0;
		int j=string.length() - 1;
		char array[] = string.toCharArray();
		ArrayList<Character> vowelsList = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		
		while (i<j) {
			
			if(vowelsList.contains(array[i]) && vowelsList.contains(array[j])){
				
				char temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}else if(!vowelsList.contains(array[i])) {
				i++;
			}else if(!vowelsList.contains(array[j])) {
				j--;
			}
			
		}
		
		return String.valueOf(array);
	}

}
