package com.dsa.array.basic.traversal;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	N = 5;
		int	arr1[] = {2, 3, 2, 3, 5};
		int	P = 5;

		N = 2;
		int	arr[] = {8,9};
		P = 9;
		FrequencyCount frequencyCount = new FrequencyCount();
		frequencyCount.frequencyCount(arr, N, P);
	}

	public void frequencyCount(int arr[], int N, int P)
	{

		LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();

		for(int i =0;i<N;i++) {
			if(arr[i]<=N) {
				hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0)+1);
			}
			//		else {
			//
			//			}
		}

		System.out.println(hashMap);

		for(int i=1;i<=N;i++) {

			arr[i-1] = hashMap.getOrDefault(i,0);
		}

		for(int i:arr) {
			System.out.println(i);
		}
	}
}
