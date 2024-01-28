package coding.challenge.hundreddays;

public class D12C_SortArray_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {25,10,66,48,2,33,59,45,45,01,55,12,96,101,92};
		int temp;
		int n=0;
		int min = array[0];
		int positionOfMinValue = 0;
		boolean isChanged = false;
		for(int j = 0;j<array.length;j++) {

			n=n+1;
			min = j;
			for(int i = j+1;i<array.length;i++) {
				n=n+1;
				if(array[min]>array[i]) {
					min = i;
				}	

			}

			temp = array[j];
			array[j] = array[min];
			array[min] = temp;

		}

		for(int num : array) {
			System.out.print(num+" ");
		}

		System.out.println("\nvalue of n is "+n);
	}

}

////output
//1 2 10 12 25 33 45 45 48 55 59 66 92 96 101 
//Number of times loop executed for 15 elements is 105