package coding.challenge.hundreddays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class D08_DuplicateCharInString {

	public static void main(String[] args) {
		
		D08_DuplicateCharInString d08_DuplicateCharInString = new D08_DuplicateCharInString();
		d08_DuplicateCharInString.duplicateCharUsingHashmap();
		d08_DuplicateCharInString.findUiqueCharUsingSet();
	}

	public void duplicateCharUsingHashmap() {
		String sentanceDuplicateString = "Please go to market and buy some chocolates";

		char[] charArray =	sentanceDuplicateString.toCharArray();

		HashMap<Character, Integer> duplicateHashMap = new HashMap<Character, Integer>();
		StringBuilder duplicateCharacterString= new StringBuilder("");

		for(char c : charArray) {		
			duplicateHashMap.put(c, duplicateHashMap.getOrDefault(c, 0)+1);

		}
		duplicateHashMap.remove(' ');
		for(Map.Entry<Character,Integer> mapSet : duplicateHashMap.entrySet()) {

			if(mapSet.getValue()>1) {
				duplicateCharacterString.append(mapSet.getKey());
			}
		}

		System.out.println(duplicateCharacterString);
	}

	public void findUiqueCharUsingSet() {
		String sentanceDuplicateString = "Please go to market and buy some chocolates";
		Set<Character> uniqueCharacters = new HashSet<Character>();

		for(int i =0;i<sentanceDuplicateString.length();i++) {
			if(sentanceDuplicateString.charAt(i)!=' ') {
				uniqueCharacters.add(sentanceDuplicateString.charAt(i));
			}
		}

		System.out.println(uniqueCharacters);
	}
}
