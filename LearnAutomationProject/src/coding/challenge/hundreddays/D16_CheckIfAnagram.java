package coding.challenge.hundreddays;

import java.util.HashMap;

import com.dsa.beginners.basic.math.problem.CountDigits;

public class D16_CheckIfAnagram {

	public static void main(String[] args) {

		String str1 = "hello";
		String str2 = "ollhe";

		D16_CheckIfAnagram d16_CheckIfAnagram = new D16_CheckIfAnagram();
		String isAnagramString = d16_CheckIfAnagram.checkString(str1,str2);
		System.out.println(isAnagramString+" is the result ");


	}

	public String checkString(String str1, String str2) {
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		int count =0;
		
		if(str1.length()!=str2.length()) {
			return "No";
		}		
		
		
		for(int i=0;i<str1.length();i++) {
			
			hashMap.put(str1.charAt(i), hashMap.getOrDefault(str1.charAt(i), 0)+1);
		}
		
		for(int i=0;i<str2.length();i++) {
			
			
			if(!hashMap.containsKey(str2.charAt(i))) {
				return "No";
			}
			
			if(hashMap.get(str2.charAt(i))==0) {
				return "No";
			}
			
			count = hashMap.get(str2.charAt(i));
			count = count -1;
			hashMap.put(str2.charAt(i),count);
		}
		
		
		return "Yes";
	}

}
