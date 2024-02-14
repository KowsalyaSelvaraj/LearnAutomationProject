package coding.challenge.hundreddays;

public class D40_FindSumofArrayElements {

//	Java Program to find sum of elements in a given array.
//
//	Steps:
//	📌 Get the input from the user using Scanner class.
//	📌 Create a new integer array of the specified size using the new keyword.
//	📌 Prompt the user to enter each element of the array using a for loop, and read the input using scanner.nextInt().
//	📌 Calculate the sum of the array elements using a for loop that iterates over each element of the array and adds it to a sum variable.
//	📌 Print the sum of the array elements using System.out.println().
	public static void main(String[] args) {
		
		int array[] = {3,2,1,4,5};
		int i=0;
		int j= array.length-1;
		int sum =0;
		while (i<j) {
			
			sum = sum+array[i]+array[j];
			i++;
			j--;
		}
		
		sum = sum + array[j];
		System.out.println(sum+" is the value");

	}

}
