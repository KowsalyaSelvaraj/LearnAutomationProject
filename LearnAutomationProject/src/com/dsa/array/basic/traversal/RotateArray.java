package com.dsa.array.basic.traversal;


import java.util.ArrayList;
import java.util.Arrays;


public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray rotateArray = new RotateArray();

		int array[] = {1, 2, 3, 4, 5};
		rotateArray.rotateOnceRight(array,array.length);
		Integer[] integerArray = new Integer[] {1, 2, 3, 4, 5,6};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(integerArray));
		rotateArray.rotateMuptipleTimesLeft(arrayList,3);
	}

	public void rotateMuptipleTimesLeft(ArrayList<Integer> arr, int k) {

		int n = arr.size();
		int i=0;
		int j=n-1;
		//k - N
		//K==N 
		//K>N K%N
		//K<N
		int num=0;
		for(int m:arr)
		{
			System.out.println(m);
		}
		if(arr.size()!=k){
			k = k%n;
			while(i<j) {
				num++;
				int temp = arr.get(i);
				arr.set(i, arr.get(j));	
				arr.set(j, temp);	
				i++;
				j--;
			}

			i=n-k;
			j=n-1;

			while(i<j) {
				num++;
				int temp = arr.get(i);
				arr.set(i, arr.get(j));	
				arr.set(j, temp);	
				i++;
				j--;

			}

			i=0;
			j=n-k-1;

			while(i<j) {
				num++;
				int temp = arr.get(i);
				arr.set(i, arr.get(j));	
				arr.set(j, temp);	
				i++;
				j--;

			}
		}
		for(int m:arr)
		{
			System.out.println(m);
		}


		System.out.println("NUm of times "+num);
	}

	public void rotateOnceRight(int[] arr,int n) {

		int rotateTimes = 1;
		int i=0;
		int j=n-1;
		//{5,4,3,2,1}
		//{5,1,2,3,4}
		int num=0;

		while(i<=j) {
			num++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		//sc 1 : n=5 rotate = 1
		i=0;
		j=rotateTimes-1;

		while(i<=j) {
			num++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}

		i=rotateTimes;
		j=n-1;

		while(i<=j) {
			num++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}


		for(int k:arr)
		{
			System.out.println(k);
		}
		System.out.println("NUm of times "+num);
	}

}
