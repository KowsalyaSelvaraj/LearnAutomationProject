package com.dsa.beginners.basic.math.problem;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseANumber reverseANumber = new ReverseANumber();
	//	reverseANumber.reverse_digit(1456982);
		reverseANumber.reverse_digitUsingWhileLoop(1456982);

	}

	public void reverse_digit(long n)
	{
		char[] digitArray = String.valueOf(n).toCharArray();
		char temp = '0';
		int lastIndex = digitArray.length-1;
		for(int i=0;i<(digitArray.length/2); i++){

			temp = digitArray[i];
			digitArray[i] = digitArray[lastIndex];
			digitArray[lastIndex] = temp;
			lastIndex--;

		}

		System.out.println(Long.parseLong(String.valueOf(digitArray)));


	}

	public void reverse_digitUsingWhileLoop(long n)
	{
		char[] digitArray = String.valueOf(n).toCharArray();
		char temp = '0';
		int lastIndex = digitArray.length-1;
		int startIndex = 0;
		while(startIndex<lastIndex) {

			temp = digitArray[startIndex];
			digitArray[startIndex] = digitArray[lastIndex];
			digitArray[lastIndex] = temp;
			lastIndex--;
			startIndex++;

		}

		System.out.println(Long.parseLong(String.valueOf(digitArray)));
	}

}
