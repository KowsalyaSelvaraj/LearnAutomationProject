package coding.challenge.hundreddays;

public class D85_AddCommaForThousands {

	
	//Java program to set a thousand separators for the given number.
	
	static public void main(String[] args) {
		// TODO Auto-generated method stub

		String numberString = "50050002";


		String valueWithThousandString = 	setThousand(numberString);

		System.out.println(valueWithThousandString);
	}

	static public String setThousand(String num) {

		if(num.length()<4) {
			return num;
		}
		return setThousand(num.substring(0,num.length()-3)) + "," + num.substring(num.length() - 3);


	}

}
