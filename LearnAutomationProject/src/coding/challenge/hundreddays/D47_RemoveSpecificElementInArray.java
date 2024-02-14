package coding.challenge.hundreddays;

public class D47_RemoveSpecificElementInArray {

	public static void main(String[] args) {
		int array1[] = {1,2,3,4,5,9};
		D47_RemoveSpecificElementInArray d47_RemoveSpecificElementInArray = new D47_RemoveSpecificElementInArray();
		
		d47_RemoveSpecificElementInArray.removeElement(array1,2);

	}

	public void removeElement(int[] array1, int num) {
	
		for (int i = 0; i < array1.length; i++) {
			
			if(array1[i]==num) {
				
				for (int j = i; j < array1.length-1; j++) {
					array1[j] = array1[j+1];
					
				}
				break;
				
			}
		}
		
		for (int i = 0; i < array1.length-1; i++) {
			System.out.println(array1[i]+" ");
		}
		
	}

}
