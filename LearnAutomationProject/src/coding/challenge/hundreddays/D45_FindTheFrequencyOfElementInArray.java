package coding.challenge.hundreddays;

import java.util.HashMap;

public class D45_FindTheFrequencyOfElementInArray {

//	Java Program to Count the frequency of elements in an array.
//
//	Steps:
//	📌 Get the array and length of the array.
//	📌 Use the HashMap to store the elements occurrence.
//	📌 Using for loop, start from the index 0 traverse array.
//	📌 If the element is visited for the first time, put the value as 1. If it is already visited increase the value by 1.
	public static void main(String[] args) {
		
		int array1[] = {1,2,3,4,4,5,1,9};
		D45_FindTheFrequencyOfElementInArray d45_FindTheFrequencyOfElementInArray = new D45_FindTheFrequencyOfElementInArray();
		
		d45_FindTheFrequencyOfElementInArray.findFrequency(array1);

	}

	public void findFrequency(int[] array1) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < array1.length; i++) {
			hashMap.put(array1[i], hashMap.getOrDefault(array1[i], 0)+1);
		}
		
		System.out.println(hashMap);
		
	}

}
