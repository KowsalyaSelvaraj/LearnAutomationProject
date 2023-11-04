package coding.challenge.hundreddays;

import java.util.Scanner;

public class D2_ReverseTheSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		{
//			Enter the Sentence 
//
//			give me a strong tea
//			Reversed Sentence "tea strong a me give"
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence \n");
		String sentenceString = scanner.nextLine();
		
		String[] sentenceArrayStrings = sentenceString.split(" ");
		String reversedSentence="";
		
		for (int i = sentenceArrayStrings.length - 1; i >= 0; i--) {
			reversedSentence = reversedSentence + sentenceArrayStrings[i] + " ";
		}
		
		System.out.println("Reversed Sentence \""+reversedSentence.trim()+"\"");
	}

}
