package com.dsa.array.basic.traversal;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatedNumbersInArray {

	public static void main(String[] args) {
	
		int array[] = {2,4,1,55,3,4,9,2,6};
		
		FindRepeatedNumbersInArray findRepeatedNumbersInArray = new FindRepeatedNumbersInArray();
		findRepeatedNumbersInArray.nativeApproach(array);
		
		

	}

	public void nativeApproach(int[] array) {
		
		Set<Integer> distinctElementSet = new HashSet<Integer>();
		Set<Integer> duplicateElementSet = new HashSet<Integer>();
		
		for(int i = 0;i<array.length;i++) {
			
			if(distinctElementSet.contains(array[i])) {
				distinctElementSet.remove(array[i]);
				duplicateElementSet.add(array[i]);
			}else {
				distinctElementSet.add(array[i]);
			}
			
		}
		
		System.out.println(duplicateElementSet);
		
	}

}
