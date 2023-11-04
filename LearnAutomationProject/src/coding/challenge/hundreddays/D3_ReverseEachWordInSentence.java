package coding.challenge.hundreddays;

import java.util.Scanner;

public class D3_ReverseEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		{
//			Enter the Sentence : 
//
//				be simple and healthy
//				Each Word is revered in the sentence : "eb elpmis dna yhtlaeh"
//
//		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Sentence : \n");
		
		String inputString = scanner.nextLine();
	
		String[] stringArrayStrings = inputString.split(" ");
		String reversedString = "";
		String sentenceString = "";
		
		
		for(String eachString : stringArrayStrings) {
			
			for (int i = eachString.length() - 1; i >=0; i--) {
				reversedString = reversedString + eachString.charAt(i);
			}
			
			sentenceString = sentenceString + reversedString + " ";
			reversedString = "";
		}
		
		System.out.println("Each Word is revered in the sentence : \""+sentenceString.trim()+"\"");
	}

}
