package coding.challenge.hundreddays;

import java.util.HashSet;

public class D37_FindLongestSubstring {
//	Java Program to Find Longest Substring Without Repeating Characters.
//
//	Steps:
//	📌 We start by initializing variables i, j and maxLength to 0. We also create a HashSet called set to keep track of the characters we have visited so far.
//	📌 Use a while loop to iterate through the String s.
//	📌 For each character s.charAt(j) in s, we check whether it is already in the set. If it is not in the set, we add it to the set, increment j, and update the maxLength if necessary.
//	📌 If the character is already in the set, we remove the character at i from the set, increment i, and continue with step 3.
//	📌 Once we have checked all characters in s, we return the maxLength.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Itssfine";
		D37_FindLongestSubstring d37_FindLongestSubstring = new D37_FindLongestSubstring();
		int count = d37_FindLongestSubstring.findSubStringCount(string);
		System.out.println(count+" is the count");
	}

	public int findSubStringCount(String string) {


		int i=0;
		int j=0;
		int n=string.length();
		int max=0;
		HashSet<Character> hashSet = new HashSet<Character>();
		while (i<n && j<n) {

			if(!hashSet.contains(string.charAt(j))){

				hashSet.add(string.charAt(j++));

				if(max<(j-i)) {
					max = j-i;
				}

			}else {
				hashSet.remove(string.charAt(i++));
			}

		}
		
		return max;
	}

}
