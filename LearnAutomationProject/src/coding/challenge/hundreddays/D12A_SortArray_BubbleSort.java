package coding.challenge.hundreddays;

public class D12A_SortArray_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {25,10,66,48,2,33,59,45,45,01,55,12,96,101,92};
		int temp=0;
		int n =0;
		for(int i=0;i<array.length;i++) {
			n= n+1;
			for(int j=i+1;j<array.length;j++) {
				n = n+1;
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for(int num : array) {
			System.out.print(num+" ");
		}
		System.out.println("\nNumber of times loop executed for "+array.length+" elements is "+n);
	}

}

//output
// 1 2 10 12 25 33 45 45 48 55 59 66 92 96 101 