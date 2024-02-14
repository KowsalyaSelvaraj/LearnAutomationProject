package coding.challenge.hundreddays;

import java.util.ArrayList;
import java.util.Arrays;

public class D39_RemoveVowelsFromString {

	public static void main(String[] args) {

		String string = "HelloA";
		D39_RemoveVowelsFromString d39_RemoveVowelsFromString = new D39_RemoveVowelsFromString();

		String withoutVowelString =  d39_RemoveVowelsFromString.removeVowels(string);
		System.out.println(withoutVowelString+" is the vowel");
		
		String withoutVowelString1 =  d39_RemoveVowelsFromString.removeVowelsUsingRegex(string);
		System.out.println(withoutVowelString1+" is the vowel");

	}

	public String removeVowels(String string) {

		ArrayList<Character> vowelsList = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		StringBuilder stringBuilder = new StringBuilder();
		char array[] = string.toCharArray();
		int i=0;
		int j= string.length()-1;
		while (i<=j) {

			if(!vowelsList.contains(array[i])) {
				stringBuilder.append(array[i]);
			}
			i++;


		}

		return stringBuilder.toString();
	}

	public String removeVowelsUsingRegex(String string) {

		String regexString = "[aeiouAEIOU]";
		String newString = string.replaceAll(regexString, "");

		return newString;
	}

}
