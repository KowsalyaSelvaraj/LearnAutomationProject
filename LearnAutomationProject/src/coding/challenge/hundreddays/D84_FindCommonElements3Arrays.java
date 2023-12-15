package coding.challenge.hundreddays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D84_FindCommonElements3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array1 = {2,4,6,8,10};
		Integer[] array2 = {3,6,8,12,15};
		Integer[] array3 = {1,4,6,8,15,18};
		
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(array1));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(array2));
		List<Integer> list3 =new ArrayList<Integer>(Arrays.asList(array3));
		
		list1.retainAll(list2);
		
		list1.retainAll(list3);
		
		System.out.println(list1);
	}

}
