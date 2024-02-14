package coding.challenge.hundreddays;

public class D14_FindThirdLargestElement {

	public static void main(String[] args) {
	
		int array[] = {2,4,1,66,43,24,23};
		D14_FindThirdLargestElement d14_FindThirdLargestElement = new D14_FindThirdLargestElement();
		int thirdMaxElement = d14_FindThirdLargestElement.findThirdLargestElement(array);
		System.out.println(thirdMaxElement+" is the third max element");
	}

	public int findThirdLargestElement(int[] array) {
		
		int firstMax =6;
		int secMax = 4;
		int thirdMax = 3;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]>firstMax) {
				thirdMax = secMax;
				secMax = firstMax;
				firstMax = array[i];
			}else if(array[i]>secMax) {
				thirdMax = secMax;
				secMax = array[i];
			}else if(array[i]>thirdMax) {
				thirdMax = array[i];
			}
		}
		return thirdMax;
	}

}
