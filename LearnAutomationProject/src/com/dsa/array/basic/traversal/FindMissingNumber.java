package com.dsa.array.basic.traversal;

import java.util.ArrayList;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindMissingNumber findMissingNumber = new FindMissingNumber();
		int array[] = {7,3,1,5,6,9,11,2,4,8};
		int num =  findMissingNumber.nativeApproach(array,11);
		System.out.println("Missing number is "+num);

		num =  findMissingNumber.optimizedApproach(array,11);
		System.out.println("Missing number optimized approach is "+num);
	}

	public int optimizedApproach(int[] array, int N) {

		int arraySum = 0;
		int numSum = N;
		for (int j = 0; j < array.length ; j++) {
			
			arraySum = arraySum + array[j];
			numSum = numSum + (j+1);
		}

		return numSum - arraySum;


	}

	public int nativeApproach(int[] array,int N) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 0;
		for(int i=1;i<N-1;i++) {
			list.add(array[i]);
		}


		for(int i=1;i<N;i++) {

			if(!list.contains(i)) {
				num = i;
			}
		}
		return num;

	}

}
