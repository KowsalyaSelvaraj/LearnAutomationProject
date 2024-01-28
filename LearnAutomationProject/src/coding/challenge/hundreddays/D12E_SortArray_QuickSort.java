package coding.challenge.hundreddays;

public class D12E_SortArray_QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,11,24,6,7};
		quickSort(array, 0, array.length-1);
		System.out.println(array);
	}


	public static void quickSort(int array[], int i,int j) {

		int	pivot = array[i];
		int L = i + 1;
		int R = j;
		int temp;
		while (i<j) {
			i=i+1;
			while (i>=R && array[i]< pivot) {
				i++;
			}

			while (j>=L && array[j]>pivot) {
				j--;
			}

			if(i<j && i<=R) {

				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		temp = array[j];
		array[j] = array[L];
		array[L] = temp;

		quickSort(array, L, j-1);
		quickSort(array, j+1, R);

		System.out.println(array[0]+" "+array[array.length-1]);
	}

}
