package coding.challenge.hundreddays;

public class D41_FindMaxWordsSentence {


	//	Java Program to Find Maximum Number of Words in Sentences.
	//
	//	A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
	//	You are given an array of strings sentences, where each sentences[i] represents a single sentence.
	//	Return the maximum number of words that appear in a single sentence.
	//
	//	📌 Example 1:
	//	Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
	//	Output: 6
	//
	//	📌 Explanation: 
	//	- The first sentence, "alice and bob love leetcode", has 5 words in total.
	//	- The second sentence, "i think so too", has 4 words in total.
	//	- The third sentence, "this is great thanks very much", has 6 words in total.
	//	Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
	//
	//	📌 Constraints:
	//	1 <= sentences.length <= 100
	//	1 <= sentences[i].length <= 100
	//	sentences[i] consists only of lowercase English letters and ' ' only.
	//	sentences[i] does not have leading or trailing spaces.
	//	All the words in sentences[i] are separated by a single space.

	public static void main(String[] args) {


		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

		D41_FindMaxWordsSentence d41_FindMaxWordsSentence = new D41_FindMaxWordsSentence();

		int count = d41_FindMaxWordsSentence.findMaxCount(sentences);
		System.out.println("Max count is "+count);
	}

	public int findMaxCount(String[] sentences) {

		int count =0;

		for(String sentence:sentences) {

			int wordsCount =	sentence.split(" ").length;

			if(wordsCount>count) {
				count=wordsCount;
			}
		}

		return count;
	}

}
