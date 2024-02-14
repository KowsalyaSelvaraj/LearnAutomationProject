package com.dsa.two.pointers;

import java.util.Arrays;
import java.util.HashSet;

public class DSA01_FindPairWithGivenSum {

	//	Given an array Arr of N positive integers and another number X. 
	//	Determine whether or not there exist two elements in Arr whose sum is exactly X.

	//	Input:
	//		N = 6, X = 16
	//		Arr[] = {1, 4, 45, 6, 10, 8}
	//	Output: Yes
	//	Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
	//
	//	Input:
	//		N = 5, X = 10
	//		Arr[] = {1, 2, 4, 3, 6}
	//	Output: Yes
	//	Explanation: Arr[2] + Arr[4] = 4 + 6 = 10


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DSA01_FindPairWithGivenSum dsa01_FindPairWithGivenSum = new DSA01_FindPairWithGivenSum();
		int	Arr1[] = {1, 4, 45, 6, 10, 8};
		int	Arr[] = {1,2,5,6,7};
		//int N = 6, X = 94;
		int N = 5, X = 4;
		boolean isPairSum =	dsa01_FindPairWithGivenSum.hasArrayTwoCandidates(Arr, N, X);
		//System.out.println("Is Pair Sum available "+isPairSum);


		isPairSum =	dsa01_FindPairWithGivenSum.twoPointers(Arr, N, X);
		System.out.println("Two Pointers Is Pair Sum available "+isPairSum);

		isPairSum =	dsa01_FindPairWithGivenSum.withBinarySearch(Arr, N, X);
		System.out.println("Binary Search  Is Pair Sum available "+isPairSum);
		
		isPairSum =	dsa01_FindPairWithGivenSum.withHashing(Arr, N, X);
		System.out.println("With Hasing Is Pair Sum available "+isPairSum);
		
	}

	boolean hasArrayTwoCandidates(int arr[], int n, int x) {

		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {

				if(arr[i]+arr[j]==x) {
					return true;
				}

			}
		}

		return false;

	}

	public boolean twoPointers(int[] arr, int n, int x) {

		Arrays.sort(arr);

		int i = 0;
		int j=n-1;
		int numTimes = 0;
		while (i<j) {
			numTimes++;
			if(arr[i]+arr[j]==x) {
				System.out.println(numTimes);
				return true;
			}else if(arr[i]+arr[j]<x) {
				i++;
			}else {
				j--;
			}

		}
		System.out.println(numTimes);
		return false;
	}

	public boolean withBinarySearch(int[] arr, int n, int x) {
		
		Arrays.sort(arr);
		int searchKey=0;
		
		for(int i=0;i<n;i++) {
			searchKey = x - arr[i];
			if(binarySearch(arr, i+1,n-1, searchKey)==true) {
				return true;
			}
		}
		
		
		return false;
	}

	public static boolean binarySearch(int[] arr, int i, int n, int searchKey) {
		
		int left = i;
		int right =n;
		
		while(left<=right) {
			int mid = (left + right)/2;
			if(arr[mid]==searchKey) {
				return true;
			}else if (arr[mid]<searchKey) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		
		return false;
		
		
	}
	
	public boolean withHashing(int[] arr, int n, int x) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		int value=0;
		for(int i=0;i<n;i++) {
			value  = x - arr[i];
			
			if(hashSet.contains(value)) {
				return true;
			}
			hashSet.add(arr[i]);
		}
		
		return false;
	}



}
