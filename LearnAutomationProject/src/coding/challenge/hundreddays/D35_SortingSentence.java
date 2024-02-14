package coding.challenge.hundreddays;

import java.util.Arrays;

public class D35_SortingSentence {

	public static void main(String[] args) {

		String s = "is2 sentence4 This1 a3";
		D35_SortingSentence d35_SortingSentence = new D35_SortingSentence();
		String sortedString = d35_SortingSentence.sortTheSentence(s);
		System.out.println("Sorted String =>"+sortedString);
		d35_SortingSentence.sortAlphabeticalOrder(s);
		int i=5;
		int j=5;
		System.out.println(i--);
		System.out.println(i);
		System.out.println(--j);
		System.out.println(j);
	}

	public String sortTheSentence(String s) {

		String[] originalStrings = s.split(" ");

		String[] sortedStrings = new String[originalStrings.length];


		for(String wordString : originalStrings) {


			int index = Character.getNumericValue(wordString.charAt(wordString.length()-1));

			sortedStrings[index - 1] = wordString.substring(0,wordString.length()-1);

		}
		String sortedString="";

		for(String string : sortedStrings) {
			sortedString = sortedString + string+" ";
		}
		return sortedString;
	}

	public void sortAlphabeticalOrder(String s) {

		String[] originalStrings = s.split(" ");
		Arrays.sort(originalStrings);

		for(String wordString : originalStrings) {
			System.out.println(wordString);

		}

	}

}
