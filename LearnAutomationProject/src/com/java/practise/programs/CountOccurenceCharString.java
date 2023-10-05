package com.java.practise.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurenceCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentenceString = "Hello team do it as soon as team";

		CountOccurenceCharString countOccurenceCharString = new CountOccurenceCharString();
		countOccurenceCharString.numberOfWords(sentenceString);
		System.out.println("\n");
		countOccurenceCharString.numberOfDistinctWords(sentenceString);
		System.out.println("\n");
		countOccurenceCharString.numberOfDistinctWordsTypetwo(sentenceString);
		System.out.println("\n");
		countOccurenceCharString.noOfTimesWordsOccur(sentenceString);
		System.out.println("\n");
		countOccurenceCharString.noOfTimesWordsOccurWithOrder(sentenceString);
		System.out.println("\n");
		countOccurenceCharString.noOfTimesWordsOccurWithoutHashMap(sentenceString);
		System.out.println("\n");
		countOccurenceCharString.countNumOfOccurenceOfCharacters(sentenceString);
		System.out.println("\n");
		countOccurenceCharString.countNumOfOccurenceOfCharacterswithOrder(sentenceString);
	}

	//"Hello team do it as soon as team"
	//Number of words in the string 8
	public void numberOfWords(String sentence) {

		String[] stringArrayStrings = sentence.split(" ");

		System.out.println("Number of words in the string "+stringArrayStrings.length);


	}
	
	//"Hello team do it as soon as team"
	//Number of distinct words is 6
	public void numberOfDistinctWords(String sentence) {

		String[] stringArrayStrings = sentence.split(" ");

		Set<String> stringSet = new HashSet<String>();

		for(String string : stringArrayStrings) {
			stringSet.add(string);
		}

		System.out.println("Number of distinct words is "+stringSet.size());
	}

	//"Hello team do it as soon as team"
		//Number of distinct words is 6
	public void numberOfDistinctWordsTypetwo(String sentence) {

		String[] stringArrayStrings = sentence.split(" ");

		Set<String> stringSet = new HashSet<String>(Arrays.asList(stringArrayStrings));

		System.out.println("Number of distinct words found by Arrays.asList is "+stringSet.size());
	}
	
	//"Hello team do it as soon as team"
	//New Hash Map{as=2, Hello=1, team=2, do=1, it=1, soon=1}
	//as 2 Hello 1 team 2 do 1 it 1 soon 1 
	public void noOfTimesWordsOccur(String sentence) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		String[] stringArrayStrings = sentence.split(" ");
		int count =0;
		for(String wordString  : stringArrayStrings) {
			count =0;
			if(hashMap.containsKey(wordString)) {
				count = hashMap.get(wordString);
				hashMap.put(wordString, count+1);
			}else {
				hashMap.put(wordString, 1);
			}
			
		}
		System.out.println("Hash Map with count of each disticnt word"+hashMap);
		
		String newSentenceString = "";
		for(Map.Entry<String,Integer> entry : hashMap.entrySet()) {
			newSentenceString = newSentenceString+entry.getKey()+" "+entry.getValue()+" ";
		}
		
		System.out.println(newSentenceString);
	}
	//"Hello team do it as soon as team"
	//New Hash Map{Hello=1, team=2, do=1, it=1, as=2, soon=1}
	//Hello 1 team 2 do 1 it 1 as 2 soon 1 
	public void noOfTimesWordsOccurWithOrder(String sentence) {
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();
		
		String[] stringArrayStrings = sentence.split(" ");
		int count =0;
		for(String wordString  : stringArrayStrings) {
			count =0;
			if(hashMap.containsKey(wordString)) {
				count = hashMap.get(wordString);
				hashMap.put(wordString, count+1);
			}else {
				hashMap.put(wordString, 1);
			}
			
		}
		System.out.println("LinkedHashMap with count of each disticnt word order maintained"+hashMap);
		
		String newSentenceString = "";
		for(Map.Entry<String,Integer> entry : hashMap.entrySet()) {
			newSentenceString = newSentenceString+entry.getKey()+" "+entry.getValue()+" ";
		}
		
		System.out.println(newSentenceString);
	}
	//"Hello team do it as soon as team"
	//Hello1 team2 do1 it1 as2 soon1 
	public void noOfTimesWordsOccurWithoutHashMap(String sentence) {
				
		String[] stringArrayStrings = sentence.split(" ");
		String newSentence="";
		Set<String> stringSet = new LinkedHashSet<String>(Arrays.asList(stringArrayStrings));
		int count = 0;
		for(String string : stringSet) {
			count = 0;
			for(int j=0;j<stringArrayStrings.length;j++) {
				
				if(string.equalsIgnoreCase(stringArrayStrings[j])) {
					count++;
				}
			}
			newSentence = newSentence + string +count+" ";
		}
	
		System.out.println("Number Of words with its count without hashmap. using Set- LinkedHashSet"+newSentence);
	}	
	
	
	//count number of distinct letters
//	Number of times each letter is dispalyed =>{a=4, s=3, t=3, d=1, e=3, H=1, i=1, l=2, m=2, n=1, o=4}
	public void countNumOfOccurenceOfCharacters(String sentence) {
		
		String sentenceWithoutSpaceString = sentence.replace(" ", "");
		
		char[] charArray = sentenceWithoutSpaceString.toCharArray();
		HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
		int count = 0;
		
		for(int i=0;i<charArray.length;i++) {
			count = 0;
			if(hashMap.containsKey(charArray[i])) {
				count = hashMap.get(charArray[i]);
				hashMap.put(charArray[i], count+1);
			}else {
				hashMap.put(charArray[i], 1);
			}
		}
		
		System.out.println("Number of times each letter is dispalyed =>"+hashMap);
	}
	
	//count number of distinct letters
//	Number of times each letter is dispalyed =>{a=4, s=3, t=3, d=1, e=3, H=1, i=1, l=2, m=2, n=1, o=4}
	public void countNumOfOccurenceOfCharacterswithOrder(String sentence) {
		
		String sentenceWithoutSpaceString = sentence.replace(" ", "");
		
		char[] charArray = sentenceWithoutSpaceString.toCharArray();
		LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<Character, Integer>();
		int count = 0;
		
		for(int i=0;i<charArray.length;i++) {
			count = 0;
			if(hashMap.containsKey(charArray[i])) {
				count = hashMap.get(charArray[i]);
				hashMap.put(charArray[i], count+1);
			}else {
				hashMap.put(charArray[i], 1);
			}
		}
		
		System.out.println("Number of times each letter is dispalyed =>"+hashMap);
		
		String newString = "";
		for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
			
			newString = newString + entry.getKey()+entry.getValue();
		}
		
		System.out.println(newString);
	}
	
}
