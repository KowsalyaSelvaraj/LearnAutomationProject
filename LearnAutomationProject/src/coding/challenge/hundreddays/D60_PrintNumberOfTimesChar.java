package coding.challenge.hundreddays;

public class D60_PrintNumberOfTimesChar {


	public static void main(String[] args) {

		String inputString = "a3b4c2";
		String outputString = "";

		for(int i = 0;i<inputString.length();i=i+2) {

			if(Character.isAlphabetic(inputString.charAt(i))){

				int numberOfTimes = Integer.parseInt(String.valueOf(inputString.charAt(i+1)));
				while(numberOfTimes>0) {
					outputString = outputString + inputString.charAt(i);
					numberOfTimes--;
				}
			}
		}
		
		System.out.println(outputString);
	}
}