package com.dsa.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DSA03_FindFourSumWithGivenSum {

	//	Given an array nums of n integers, return an array of all the 
	//			unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
	//
	//		0 <= a, b, c, d < n
	//		a, b, c, and d are distinct.
	//		nums[a] + nums[b] + nums[c] + nums[d] == target
	//		You may return the answer in any order.
	//
	//		 
	//
	//		Example 1:
	//
	//		Input: nums = [1,0,-1,0,-2,2], target = 0
	//		Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
	//		Example 2:
	//
	//		Input: nums = [2,2,2,2,2], target = 8
	//		Output: [[2,2,2,2]]
	//		 
	//
	//		Constraints:
	//
	//		1 <= nums.length <= 200
	//		-109 <= nums[i] <= 109
	//		-109 <= target <= 109

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DSA03_FindFourSumWithGivenSum dsa01_FindPairWithGivenSum = new DSA03_FindFourSumWithGivenSum();

		int	Arr[] = {1,0,-1,0,-2,2};

		int  X = 0;
		System.out.println(dsa01_FindPairWithGivenSum.fourSum(Arr, X));
		
	}

	boolean find3Numbers(int A[], int n, int X) {

		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {

				for(int k =j+1;k<n;k++)
					if(A[i]+A[j]+A[k]==X) {
						return true;
					}

			}
		}

		return false;

	}
	public List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> listInnerIntegers; 
		int flag=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {

				for(int k =j+1;k<nums.length;k++)
					for(int l =k+1;l<nums.length;l++) {
						listInnerIntegers = new ArrayList<Integer>();
						flag=0;
						if(nums[i]+nums[j]+nums[k]+nums[l]==target) {
							System.out.println("inside 4th loop");
							
							listInnerIntegers.add(nums[i]);
							listInnerIntegers.add(nums[j]);
							listInnerIntegers.add(nums[k]);
							listInnerIntegers.add(nums[l]);
							flag= 1;
							System.out.println(listInnerIntegers);
						}
						if(flag==1) {
							list.add(listInnerIntegers);
							//listInnerIntegers.clear();
							System.out.println(list);
						}
					}
			}
		}

		
		return list;
	}

	public boolean twoPointers(int A[], int n, int X) {

		Arrays.sort(A);
		int left=0;
		int right =0;
		for(int i = 0;i<n-2;i++) {
			left = i+1;
			right = n-1;

			while (left<right) {

				if(A[i]+A[left]+A[right]==X) {
					return true;
				}else if(A[i]+A[left]+A[right]<X){
					left++;
				}else {
					right--;
				}
			}

		}

		return false;
	}



	public boolean withHashing(int A[], int n, int X) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		int value=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			value  = X - A[i];

			for (int j = i+1; j < X; j++) {

				sum = value - A[j];

				if(hashSet.contains(sum)) {
					return true;
				}
				hashSet.add(A[j]);
			}
		}

		return false;
	}



}
