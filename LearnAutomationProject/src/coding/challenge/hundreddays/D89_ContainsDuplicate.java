package coding.challenge.hundreddays;

import java.util.ArrayList;
import java.util.List;

public class D89_ContainsDuplicate {

	
//	Contains Duplicate.
//
//	Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//	 
//	Example 1:
//	Input: nums = [1,2,3,1]
//	Output: true
//	Example 2:
//	Input: nums = [1,2,3,4]
//	Output: false
//	Example 3:
//	Input: nums = [1,1,1,3,3,4,3,2,4,2]
//	Output: true
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,1,1,3,3,4,3,2,4,2};
		boolean isDuplicateAvailable = false;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if(list.contains(nums[i])) {
				isDuplicateAvailable = true;
				break;
			}else {
				list.add(nums[i]);
			}
		}
		
		System.out.println(isDuplicateAvailable + " is the result");
	}

}
