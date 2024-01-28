package coding.challenge.hundreddays;

import java.awt.RenderingHints.Key;

public class D12D_SortArray_InsertionSort {

	public static void main(String[] args) {
		//int[] array = {12,11,13,5,6};
		
		int[] array = {25,10,66,48,2,33,59,45,45,01,55,12,96,101,92};

		int key=0;
		int j = 0;
		int n = 0;
		for(int i =1;i<array.length;i++) {
			n=n+1;
			key = array[i];
			j = i -1;

			while(j>=0 && array[j]>key) {
				n = n+1;
				array[j+1] = array[j];
				j = j -1;

			}
			array[j+1] = key;

		}

		for(int arrayElements : array) {
			System.out.print(arrayElements+" ");
		}

		System.out.println("\nNumer of times loops executed for "+array.length+" is "+n);
	}

}

//o/p
//1 2 10 12 25 33 45 45 48 55 59 66 92 96 101 
//Numer of times loops executed for 15 is 50
