package com.dsa.array.basic.traversal;

public class SortAnArray {

	
	public static void main(String[] args) {
		SortAnArray sortAnArray = new SortAnArray();
		
		int[] array = {1,0,2,2,1}; // 0, 1,1,2,2
		sortAnArray.quickSort(array, 0,array.length-1);
		
		for (int i : array) {
			System.out.println(i);
		}
	}

	public void quickSort(int[] array, int low, int high) {
		
		if(low>high) return;
		
		int mid = (low+high)/2;
		int pivot = array[mid];
		
		int i = low;
		int j = high;
		
		
		while (i<=j) {
			
			while (array[i]<pivot) {
				i++;
			}
			
			while (array[j]>pivot) {
				j--;
			}
			
			if(i<=j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low<j) {
			quickSort(array, low, j);
		}
		
		if(high>i) {
			quickSort(array, i, high);
		}
	}

	

	
}
