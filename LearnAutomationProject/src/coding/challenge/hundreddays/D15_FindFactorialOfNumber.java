package coding.challenge.hundreddays;

public class D15_FindFactorialOfNumber {

	public static int count=0;
	public static void main(String[] args) {


		int num=10;
		D15_FindFactorialOfNumber d15_FindFactorialOfNumber = new D15_FindFactorialOfNumber();

		int fact = 	d15_FindFactorialOfNumber.usingTwoPointers(num);

		System.out.println(fact+ " is the factorial of "+num);

		fact = 	d15_FindFactorialOfNumber.usingRecursiveMethod(num);

		System.out.println(fact+ " is the factorial of "+num);
		System.out.println("Count of recursive "+count);
	}

	public int usingRecursiveMethod(int num) {

		if(num==0)
			return 0;
		if(num==1)
			return 1;
		count++;

		return num * usingRecursiveMethod(num-1);
	}

	public int usingTwoPointers(int num) {

		int	i=1;
		int j=num;
		int fact =1;
		int count = 0;
		while (i<=j) {
			count++;
			if(i!=j) {
				fact = fact * i *j;
			}else {
				fact = fact *i;
			}
			i++;
			j--;
		}
		System.out.println("Count of two pointers "+count);
		return fact;
	}




}
