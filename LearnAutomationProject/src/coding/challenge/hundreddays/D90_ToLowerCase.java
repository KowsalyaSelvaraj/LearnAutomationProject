package coding.challenge.hundreddays;

public class D90_ToLowerCase {

	/*
	 * To Lower Case.
	 * 
	 * Given a string s, return the string after replacing every uppercase letter
	 * with the same lowercase letter.
	 * 
	 * Example 1: Input: s = "Hello" Output: "hello" Example 2: Input: s = "here"
	 * Output: "here" Example 3: Input: s = "LOVELY" Output: "lovely"
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String letterString = "LOVELY";
		
		String toLowerCaseString = letterString.toLowerCase();
		
		System.out.println(toLowerCaseString);
		
		
		//using for loop
		
		char[] charArray = letterString.toCharArray();
		String result = "";
		for(char c : charArray) {
			
			if(Character.isUpperCase(c)) {
				System.out.println((int)c);
				
				result = result + (char)(c+32);
				
			}else {
				result = result + c;
			}
		}
		
		System.out.println(result);
	}

}
