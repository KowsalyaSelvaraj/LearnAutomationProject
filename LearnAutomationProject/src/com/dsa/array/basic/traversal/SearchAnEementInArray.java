package com.dsa.array.basic.traversal;

public class SearchAnEementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SearchAnEementInArray searchAnEementInArray = new SearchAnEementInArray();

		int array[] = {2,4,1,66,43,23};
		String elementString=	searchAnEementInArray.nativeMethod(array, 205);
		System.out.println(elementString);

	}

	public String nativeMethod(int[] array, int number) {

		for(int i=0;i<array.length;i++) {
			if(number == array[i]) {

				return "number found";

			}
		}

		return "number not found";

	}

}
