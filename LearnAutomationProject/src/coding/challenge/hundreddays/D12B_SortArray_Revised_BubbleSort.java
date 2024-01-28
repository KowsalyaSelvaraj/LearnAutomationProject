package coding.challenge.hundreddays;

public class D12B_SortArray_Revised_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {25,10,66,48,2,33,59,45,45,01,55,12,96,101,92};
		int temp=0;
		boolean swapped = false;
		int n =0;
		for(int i = 0; i<array.length-1;i++) {
			n= n+1;
			swapped = false;
			for(int j=0;j<array.length -i - 1;j++) {
				n= n+1;
				if(array[j]>array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					swapped = true;
				}
			}    

			if(swapped==false) {
				break;
			}
		}

		for(int num : array) {
			System.out.print(num+" ");
		}

		System.out.println("\nNumber of times loop executed for "+array.length+" elements is "+n);
	}

}

////output
//1 2 10 12 25 33 45 45 48 55 59 66 92 96 101 
//Number of times loop executed for 15 elements is 105