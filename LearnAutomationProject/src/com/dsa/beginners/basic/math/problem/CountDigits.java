package com.dsa.beginners.basic.math.problem;

import java.util.Iterator;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigits countDigits = new CountDigits();
		
		countDigits.nativeApproach();
	}

	public void nativeApproach() {
		
		int N = 22074;
		int count = 0;
		char[] array =  String.valueOf(N).toCharArray();
//		System.out.println(String.valueOf(N));
//		System.out.println(String.valueOf(N).toCharArray());
//		System.out.println(array);
//		
		for(int i=0;i<array.length;i++) {
			
			if((array[i]!='0') && N%(array[i] - '0')==0) {
				count= count +1;
			}
		}
		
		System.out.println(count+" number of elements divide number");
	}
}
