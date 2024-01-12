package coding.challenge.hundreddays;

import java.util.HashMap;

public class D91_SumTwoGetTarget {


	/*
	 * Two Sum.
	 * 
	 * 
	 * Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
	 * Because nums[0] + nums[1] == 9, we return [0, 1].
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] {2,7,11,15};
		int[] arr =  new int[5];
		int target = 9;

		for(int i=0;i<nums.length;i++) {

			for(int j=i+1; j<nums.length;j++) {

				if(nums[i]+nums[j]==target) {
					arr[0] = i;
					arr[1] = j;
					break;
				}
			}


		}
		System.out.println(arr[0]+" - "+arr[1]);


		//another implementation
		int[] numbers = {2,7,11,15};
		int target1 = 13;
		int[] res = twoSum(numbers, target1);
		for (int i : res) {
			System.out.println(i);
		}


	}



	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int n = target - numbers[i];
			if (map.containsKey(n)) {
				return new int[] {map.get(n), i};
			}
			map.put(numbers[i], i);
		}
		return new int[0];
	}

}
