package coding.challenge.hundreddays;

public class D42_MergeTwoSortedArray {

	//Java program to merge two sorted arrays.
	public static void main(String[] args) {

		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {2, 4, 6, 8, 10};
		int[] mergedArray = mergeArrays(arr1, arr2);

		for(int element : mergedArray) {
			System.out.print(element+" ");
		}
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {

		
		int i=0;
		int j=0;
		int k=0;
		
		int[] mergedArray = new int[arr1.length+arr2.length];
		
		while (i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
			}else {
				mergedArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while (i<arr1.length) {
			mergedArray[k] = arr1[i];
			i++;
			k++;
		}
		while (j<arr2.length) {
			mergedArray[k] = arr2[j];
			j++;
			k++;
		}
		
		return mergedArray;
	}

}
