package coding.challenge.hundreddays;

public class D07_CountNumberOfVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D07_CountNumberOfVowelsInString d07_CountNumberOfVowelsInString = new D07_CountNumberOfVowelsInString();
		d07_CountNumberOfVowelsInString.countVowelNormalWay();
		d07_CountNumberOfVowelsInString.countVowelUsingRecursiveMethods();
		d07_CountNumberOfVowelsInString.countVowelUsingRegularExpression();


	}

	public void countVowelNormalWay() {
		String stringWithVowelString = "I have to go to school today";

		char[] charArray = stringWithVowelString.toLowerCase().toCharArray();
		int	vowelCharCount = 0;
		for(char letter : charArray) {
			if(letter=='a' || letter=='e' || letter == 'i' || letter == 'o' || letter == 'u') {
				vowelCharCount++;
			}
		}

		System.out.println(vowelCharCount +" = count of vowels");
	}

	public void countVowelUsingRecursiveMethods() {
		String stringWithVowelString = "I have to go to school today";

		D07_CountNumberOfVowelsInString d07_CountNumberOfVowelsInString = new D07_CountNumberOfVowelsInString();

		int noOfVowels =	d07_CountNumberOfVowelsInString.countVowels(stringWithVowelString.toLowerCase(),stringWithVowelString.length());
		System.out.println(noOfVowels+ " = no of vowels using Recursive method");
	}

	public int countVowels(String string,int length) {
		if(length == 1) {
			return isVowel(string.charAt(length-1));
		}
		return countVowels(string, length-1) + isVowel(string.charAt(length-1));
	}

	public int isVowel(char letter) {

		if(letter=='a' || letter=='e' || letter == 'i' || letter == 'o' || letter == 'u')
			return 1;
		else {
			return 0;
		}
	}

	public void countVowelUsingRegularExpression() {
		String stringWithVowelString = "I have to go to school today";

		int numberOfVowles = stringWithVowelString.length() - stringWithVowelString.toLowerCase().replaceAll("[aeiou]","").length();
		System.out.println(numberOfVowles+" = using Regular Expression");
	}


}
