package coding.challenge.hundreddays;

public class D43_FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {1,2,3,4,6,7,8,9,10};


		int array1[] = {3,4,5,6,7,9,10,11,12};
		int endNum = 12;
		int startNum =3;



		D43_FindMissingNumber d43_FindMissingNumber = new D43_FindMissingNumber();
		int missingNumber = d43_FindMissingNumber.findMissingNumber(array);
		System.out.println(missingNumber+" started from 1");

		int missingNumber1 = d43_FindMissingNumber.findMissingNumber(array1,startNum,endNum);
		System.out.println(missingNumber1+" using not starts from 1");
	}

	public int findMissingNumber(int[] array1, int startNum, int endNum) {
		int expectedSum = endNum;
		int actualSum = 0;


		for(int i=0;i<array1.length;i++) {

			expectedSum = expectedSum + (i+startNum);

			actualSum = actualSum + array1[i];

		}

		return expectedSum - actualSum;
	}

	public int findMissingNumber(int[] array) {


		int expectedSum = array[array.length-1];
		int actualSum = 0;

		for(int i=0;i<array.length;i++) {

			expectedSum = expectedSum + (i+1);
			actualSum = actualSum + array[i];

		}

		int missingNum = expectedSum - actualSum;
		return missingNum;
	}

}
