package com.dsa.beginners.basic.math.problem;


import java.math.*; 

public class FindFirstAndLastDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindFirstAndLastDigitOfNumber lastDigitOfNumber = new FindFirstAndLastDigitOfNumber();

		//		lastDigitOfNumber.nativeApproach();
		//		lastDigitOfNumber.nativeApproach2();

		//	lastDigitOfNumber.useMathLog();
		lastDigitOfNumber.getLastDigit("3", "10");
		int num =	lastDigitOfNumber.getLastDigitExponential("10", "1");
		System.out.println(num+" is the last digit ");
		
		lastDigitOfNumber.UsingString();
	}

	public void nativeApproach() {

		int number = 43289;
		int lastDigit = number %10;
		int reverseNum =0;
		int remainder = 0;
		int firstDigit = 0;
		System.out.println("Last digit of "+number+" is "+lastDigit);
		int num = number;
		while(num>0) {
			remainder = num%10;
			num = num/10;
			reverseNum = (reverseNum*10) + remainder;
		}
		firstDigit = reverseNum % 10;
		System.out.println("First digit of "+number+" is "+firstDigit);


	}

	public void nativeApproach2() {

		int number = 10289;

		int lastDigit = number %10;
		System.out.println("Last digit of "+number+" is "+lastDigit);
		int num = number;
		while(num>=10) {
			num = num/10;
		}

		System.out.println("First digit of "+number+" is "+num);


	}

	public void useMathLog() {

		int number = 59;

		int digits =	(int)	Math.log10(number);
		System.out.println(digits);
		/// = n
		//---------------
		//	10 Pow digits

		number = (int) (number/(int)(Math.pow(10, digits)));
		System.out.println("First Digit "+number);
	}

	//User function Template for Java
	public int getLastDigit(String a, String b) {
		//int num = Math.pow(Integer.parseInt(a),Integer.parseInt(b));
//3 to the pow 10
		long numA = Integer.parseInt(a);
		int numB = Integer.parseInt(b);
		long finalNum = 1;
		for(int i=1;i<=numB;i++){
			finalNum = finalNum * numA;

		}
		String newString = Long.toString(finalNum);
		int num = Integer.parseInt(String.valueOf(newString.charAt(newString.length()-1)));
		return num;
	}

	public int getLastDigitExponential(String a, String b) {
		//int num = Math.pow(Integer.parseInt(a),Integer.parseInt(b));
		int lengthA = a.length();
		int lengthB = b.length();

		char[] numB = b.toCharArray();
		char[] numA = a.toCharArray();
		int num=1;

		if(lengthA==1 && lengthB == 1 && numA[0]=='0' && numB[0]=='0') {
			return 0;
		}else if(lengthA==1 && numA[0]=='0'){
			return 0;
		}else if(lengthB==1 && numB[0]=='0'){
			return 1;
		}else {

			if(numA[numA.length-1]==6 ||numA[numA.length-1]==5||numA[numA.length-1]==1) {
				return numA[numA.length-1] - '0';
			}else if(numB.length==1 ){
				if(numB[0]%4==0) {
					for(int i=1;i<=4;i++) {
						num = num * (numA[lengthA-1] - '0');
					}
				}else {
					for(int i=1;i<=numB[0]%4;i++) {
						num = num * (numA[lengthA-1] - '0');
					}
				}
			}else if((Integer.parseInt(numB[lengthB-2] +""+numB[lengthB-1]))%4==0){
				for(int i=1;i<=4;i++) {
					num = num * (numA[lengthA-1] - '0');
				}
			}else {
				for(int i=1;i<=(Integer.parseInt(numB[lengthB-2] +""+numB[lengthB-1]))%4;i++) {
					num = num * (numA[lengthA-1] - '0');
				}
			}

			System.out.println(num%10);

			return num%10;
		}
	}

	public void UsingString() {

		int number = 43289;
		char[] valueString = String.valueOf(number).toCharArray();
		int lastDigit = Integer.parseInt(Character.toString(valueString[valueString.length-1]));
		int firstDigit =  Integer.parseInt(Character.toString(valueString[0]));

		System.out.println("First digit "+firstDigit+" \nLast Digit "+lastDigit);


	}
}
