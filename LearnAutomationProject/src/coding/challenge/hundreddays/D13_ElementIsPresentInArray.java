package coding.challenge.hundreddays;

public class D13_ElementIsPresentInArray {

	//Java program to an element present in the array or not.

	public static void main(String[] args) {

		int array[] = {1,4,6,7,9,11,13,15,17};
		int toSearch = 11;
		D13_ElementIsPresentInArray d13_ElementIsPresentInArray = new D13_ElementIsPresentInArray();

		boolean elementFound = d13_ElementIsPresentInArray.binarySearchInArray(array,toSearch);
		System.out.println(elementFound+" is the result");
	}
//
//	Start is 0 End is 9
//	Start is 5 End is 9
//	Start is 5 End is 6
//	true is the result
	public boolean binarySearchInArray(int[] array, int n) {

		int start = 0;
		int end = array.length-1;

		int mid=0;;

		while (start<=end) {
			 mid = (start + end)/2;
			System.out.println("Start is "+start+" End is "+end);
			if(array[mid]==n) {
				return true;
			}else if(array[mid]<n){
				start = mid+1;
			}else if(array[mid]>n){
				end = mid-1;
			}
		}


		return false;
	}




}
