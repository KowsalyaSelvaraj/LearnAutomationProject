package coding.challenge.hundreddays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D44_FindCommonElementsInTwoArray {
//	Java Program to Find Common Elements Between Two Arrays.
//
//	Steps:
//	📌 Get the two java Arrays.
//	📌 Iterate through each and every element of the arrays one by one and check whether they are common in both.
//	📌 Add each common element in the set for unique entries.
	public static void main(String[] args) {

		int array1[] = {2,3,4,5,6,7};
		int array2[] = {2,5,6,7,9};

		D44_FindCommonElementsInTwoArray d44_FindCommonElementsInTwoArray = new D44_FindCommonElementsInTwoArray();

		ArrayList<Integer> commonElements= 	d44_FindCommonElementsInTwoArray.findCommonElements(array1,array2);
		System.out.println(commonElements);
	}

	public ArrayList<Integer> findCommonElements(int[] array1,int[] array2) {
		
		
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		for(int element : array1) {
			arrayList1.add(element);
		}
		
		for(int element : array2) {
			arrayList2.add(element);
		}
	
		arrayList1.retainAll(arrayList2);
		
		return arrayList1;
	}

}
