package com.dsa.array.basic.traversal;

public class FindMaxAndMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 long array[] = {4,1,6,22,31,11,24,9,15};
		 
		FindMaxAndMinElement findMaxAndMinElement = new FindMaxAndMinElement();
		findMaxAndMinElement.nativeApproach(array,array.length);
		
		
	}

	public void nativeApproach(long a[],long n) {
		 
		 
		long minValue = Long.MAX_VALUE;
		
		long maxValue = Long.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			
			if(a[i]>maxValue) {
				maxValue = a[i];
			}
			if(a[i]<minValue) {
				minValue = a[i];
			}
		}
		 
		System.out.println(minValue +" is min value");
		System.out.println(maxValue +" is max value");
	}
	
	static class Pair {

		int min;
		int max;
	}

	static Pair getMinMax(int arr[], int low, int high)
	{
		Pair minmax = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;

		// If there is only one element
		if (low == high) {
			minmax.max = arr[low];
			minmax.min = arr[low];
			return minmax;
		}

		/* If there are two elements */
		if (high == low + 1) {
			if (arr[low] > arr[high]) {
				minmax.max = arr[low];
				minmax.min = arr[high];
			}
			else {
				minmax.max = arr[high];
				minmax.min = arr[low];
			}
			return minmax;
		}

		/* If there are more than 2 elements */
		mid = (low + high) / 2;
		mml = getMinMax(arr, low, mid);
		mmr = getMinMax(arr, mid + 1, high);

		/* compare minimums of two parts*/
		if (mml.min < mmr.min) {
			minmax.min = mml.min;
		}
		else {
			minmax.min = mmr.min;
		}

		/* compare maximums of two parts*/
		if (mml.max > mmr.max) {
			minmax.max = mml.max;
		}
		else {
			minmax.max = mmr.max;
		}

		return minmax;
	}


}
