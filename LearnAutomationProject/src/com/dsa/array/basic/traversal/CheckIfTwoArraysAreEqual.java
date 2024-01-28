package com.dsa.array.basic.traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CheckIfTwoArraysAreEqual {

	public static void main(String[] args) {
		CheckIfTwoArraysAreEqual checkIfTwoArraysAreEqual  = new CheckIfTwoArraysAreEqual();


		//		long[] A = {2,1,4,5,9};
		//		long[] B = {4,5,1,2,9};


		long[] A = {1,2,5,4,0};
		long[] B = {2,4,5,0,1};

		checkIfTwoArraysAreEqual.sumApproach(A,B,A.length);
		boolean value =	checkIfTwoArraysAreEqual.removalApproach(A,B,A.length);
		System.out.println(value);
	}

	public void sumApproach(long[] A, long[] B, int N) {

		long sumA=0;
		long sumB=0;
		for(int i = 0;i<N;i++) {
			sumA = sumA + A[i];
			sumB = sumB + B[i];

		}
		System.out.println(sumA +" "+sumB );
		if(sumA==sumB) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}

	public boolean removalApproach(long[] A, long[] B, int N) {

		HashMap<Long, Integer> hashMap = new HashMap<Long, Integer>();
		int count =0;
		for(int i=0;i<A.length;i++) {

			hashMap.put(A[i],hashMap.getOrDefault(A[i], 0)+1);
//			if(hashMap.containsKey(A[i])) {
//				count = hashMap.get(A[i]);
//				count++;
//				hashMap.put(A[i], count);
//			}else {
//				hashMap.put( A[i],1);
//			}
		}
		System.out.println(hashMap);

		for(int i=0;i<B.length;i++) {
			System.out.println("b[i] "+B[i]+" i "+i);
			if(!hashMap.containsKey(B[i])) {
				System.out.println("Arrays are not equal in 1st ");
				return false;
			}

			if(hashMap.get(B[i])==0) {
				System.out.println("Arrays are not equal in 2nd");
				return false;
			}

			count = hashMap.get(B[i]);
			count--;
			hashMap.put( B[i], count);
		}
		return true;


	}

}
