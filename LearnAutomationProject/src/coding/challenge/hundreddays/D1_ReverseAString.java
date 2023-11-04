package coding.challenge.hundreddays;

import java.util.Scanner;

public class D1_ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		{
//			Enter the string :
//
//				take a cool coffee
//				Reversed String directly "eeffoc looc a ekat"
//				Reversed after converting it to char array "eeffoc looc a ekat"
//				Revered String using String Builder "eeffoc looc a ekat"
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string :\n");
		String wordString = scanner.nextLine();
		String reverseString = "";
		//used a for loop and iterated over the string using string.charAt(index)
		for (int i = wordString.length()-1; i >=0; i--) {
			reverseString = reverseString + wordString.charAt(i);
			
		}
		
		System.out.println("Reversed String directly \""+reverseString+"\"");
		
		//convert the string to character Array string.toCharArray() and then reverse
		reverseString = "";
		char[] wordArray = wordString.toCharArray();
		
		for(int i = wordArray.length - 1; i>=0;i--) {
			reverseString = reverseString + wordArray[i];
		}
		
		System.out.println("Reversed after converting it to char array \""+reverseString+"\"");
		
		//using string builder stringbuilder.reverse()
		StringBuilder builder  = new StringBuilder(wordString);
		builder.reverse();
		System.out.println("Revered String using String Builder \""+builder+"\"");
	}

}
