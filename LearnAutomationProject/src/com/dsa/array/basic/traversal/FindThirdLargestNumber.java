package com.dsa.array.basic.traversal;

public class FindThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {3,55,23,11,99,303,12,435,11,29,908,24,113};
		int firstLar = 0;
		int secLar = 0;
		int thirdLar = 0;
		
		for(int i = 0;i<array.length;i++) {
		
			if(array[i]>firstLar) {
				thirdLar = secLar;
				secLar = firstLar;
				firstLar = array[i];
			}else if(array[i]>secLar) {
				thirdLar = secLar;
				secLar = array[i];
			}else if(array[i]>thirdLar){
				thirdLar = array[i];
			}
		}
		
		System.out.println("1st large "+firstLar);
		System.out.println("2nd large "+secLar);
		System.out.println("3rd large "+thirdLar);
	}

}
