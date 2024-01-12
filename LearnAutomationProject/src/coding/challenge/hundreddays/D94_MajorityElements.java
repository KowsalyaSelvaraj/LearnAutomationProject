package coding.challenge.hundreddays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class D94_MajorityElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Majority Element.
		 * 
		 * Given an array nums of size n, return the majority element. The majority
		 * element is the element that appears more than n / 2 times. You may assume
		 * that the majority element always exists in the array.
		 * 
		 * Example 1: Input: nums = [3,2,3] Output: 3 Example 2: Input: nums =
		 * [2,2,1,1,1,2,2] Output: 2
		 */

		int[] array1 = {2,2,1,1,1,2,2};//{3,2,3};
		int count=0;
		int maxCount = 0,maxNumberKeyval=0;;
		Map<Integer,Integer> map1 = new LinkedHashMap<Integer,Integer>();
		int firstValue = array1[0];
		for(int a : array1) {

			if(map1.containsKey(a)) {
				count = map1.get(a);
				map1.put(a, count+1);
			}else {
				map1.put(a, 1);
			}
		}
		
		System.out.println(map1);

		//getting the 1st element and storing for comparison 
		maxCount = -999;
		maxNumberKeyval = -999;
		
		for(Map.Entry<Integer,Integer> entryMap : map1.entrySet()) {
			
			if(maxCount<entryMap.getValue()) {
				maxCount = entryMap.getValue();
				maxNumberKeyval = entryMap.getKey();
			}
		}
		
		System.out.println(maxNumberKeyval +" is the majority element");
		
		
		//Original solution with condition n/2
		
		int[] array2 = {2,2,1,1,1,2,2};//{3,2,3};
		
		Map<Integer,Integer> map2 = new LinkedHashMap<Integer,Integer>();
		
		for(int a : array2) {
			
			map2.put(a, map2.getOrDefault(a,0)+1);
		}
		System.out.println(map2+ "2nd map");
		int majorityelement = -1;
		for(int a : array2) {
			if(map2.get(a)>(array2.length/2)) {
				majorityelement = a;
				break;
			}
		}
		
		if(majorityelement!=-1) {
			System.out.println("Majority elemen is found is "+majorityelement);
		}else {
			System.out.println("Majority element is not found");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
