package com.dsa.two.pointers;

import java.util.Arrays;
import java.util.HashSet;

public class DSA02_FindTripletWithGivenSum {

	//	Given an array arr[] of n integers. Check whether it contains a triplet that sums up to zero. 
	//
	//	Note: Return 1, if there is at least one triplet following the condition else return 0.
	//			
	//	Input: n = 5, arr[] = {0, -1, 2, -3, 1}
	//	Output: 1
	//	Explanation: 0, -1 and 1 forms a triplet
	//	with sum equal to 0.
	//	Example 2:
	//
	//	Input: n = 3, arr[] = {1, 2, 3}
	//	Output: 0
	//	Explanation: No triplet with zero sum exists. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DSA02_FindTripletWithGivenSum dsa01_FindPairWithGivenSum = new DSA02_FindTripletWithGivenSum();

		//		int	Arr[] = {0, -1, 2, -3, 1};
		//		
		//		int N = 5, X = 0;

		int	Arr[] = {4,-16,43,4,7,-36,18};

		int N = 7, X = 0;
		boolean isThreeSum = dsa01_FindPairWithGivenSum.find3Numbers(Arr, N, X);
		System.out.println("Is Pair Sum available "+isThreeSum);


		isThreeSum =	dsa01_FindPairWithGivenSum.twoPointers(Arr, N);
		System.out.println("Two Pointers Is Triplet Sum available "+isThreeSum);

		isThreeSum =	dsa01_FindPairWithGivenSum.withHashing(Arr, N);
		System.out.println("With Hasing Is Triplet Sum available "+isThreeSum);
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

	public boolean twoPointers(int arr[], int n) {

		Arrays.sort(arr);
		int left=0;
		int X=0;
		int right =0;
		for(int i = 0;i<n-2;i++) {
			left = i+1;
			right = n-1;

			while (left<right) {

				if(arr[i]+arr[left]+arr[right]==X) {
					return true;
				}else if(arr[i]+arr[left]+arr[right]<X){
					left++;
				}else {
					right--;
				}
			}

		}

		return false;
	}



	public boolean withHashing(int arr[], int n) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		int value=0;
		int sum=0;
		int X=0;
		for(int i=0;i<n;i++) {
			value  = X -arr[i];

			for (int j = i+1; j < n; j++) {

				sum = value - arr[j];

				if(hashSet.contains(sum)) {
					return true;
				}
				hashSet.add(arr[j]);
			}
		}

		return false;
	}



}
