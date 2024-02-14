package coding.challenge.hundreddays;

public class D46_SwapTheFirstAndLastChar {
	//
	//	 Java program to swap the first and last letter in a string.
	//
	//	 Steps:
	//	 📌 We need to check, whether the string is null or single character. If yes, there is nothing to swap.
	//	 📌 We initialize two variables firstChar and lastChar, to store the first and last character respectively.
	//	 📌 Create new string named swappedString to store the result. Using substring function remove the first and
	//	 last character of a string and swap the first and last characters.

	public static void main(String[] args) {

		String nameString = "hello";
		char firstChar = nameString.charAt(0);
		char lastChar = nameString.charAt(nameString.length()-1);

		String swappedString = lastChar + nameString.substring(1, nameString.length()-1) +firstChar;

		System.out.println(swappedString);

	}

}
