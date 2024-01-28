package coding.challenge.hundreddays;

import java.util.Arrays;

public class D11_FindSmallestNumberInArray {

	public static void main(String[] args) {
	
		//method 1
		int[] numberArray = {55,69,77,21,19,84,101};

		Arrays.sort(numberArray);

		System.out.println("Smallest number in array1 => "+numberArray[0]);


		//method 2
		int[] numberArray1 = {55,69,77,21,19,84,101};
		
		int smallNumber = Integer.MAX_VALUE;
		
		for(int num : numberArray) {
			if(num<smallNumber) {
				smallNumber = num;
			}
		}
		System.out.println("small number in array2 => "+smallNumber);
	}
}
