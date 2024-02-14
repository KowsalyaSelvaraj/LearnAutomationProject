package com.dsa.two.pointers;

import java.util.Arrays;
import java.util.HashSet;

public class DSA04_FindTripletWhichGivesZero {

	//	Given an array arr of size n and an integer X. 
	//	Find if there's a triplet in the array which sums up to the given integer X.
	//	Input:
	//		n = 6, X = 13
	//		arr[] = [1 4 45 6 10 8]
	//		Output:
	//		1
	//		Explanation:
	//		The triplet {1, 4, 8} in 
	//		the array sums up to 13.
	//		
	//		Input:
	//			n = 5, X = 10
	//			arr[] = [1 2 4 3 6]
	//			Output:
	//			1
	//			Explanation:
	//			The triplet {1, 3, 6} in 
	//			the array sums up to 10.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DSA04_FindTripletWhichGivesZero dsa01_FindPairWithGivenSum = new DSA04_FindTripletWhichGivesZero();
		
		int	Arr[] = {1,4,45,6,10,8};
		
		int N = 6, X = 13;
		boolean isThreeSum = dsa01_FindPairWithGivenSum.find3Numbers(Arr, N, X);
		System.out.println("Is Pair Sum available "+isThreeSum);


		isThreeSum =	dsa01_FindPairWithGivenSum.twoPointers(Arr, N, X);
		System.out.println("Two Pointers Is Triplet Sum available "+isThreeSum);

		isThreeSum =	dsa01_FindPairWithGivenSum.withHashing(Arr, N, X);
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
