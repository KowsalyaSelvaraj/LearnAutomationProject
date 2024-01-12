package coding.challenge.hundreddays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D86_ValidatePhoneNumberAndEmailId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phoneString = "9525698711";
		
		Pattern pattern = Pattern.compile("^\\d{10}$");
		
		Matcher matcher = pattern.matcher(phoneString);
		
		if(matcher.matches()) {
			System.out.println(phoneString+" is a valid phone number");
		}else {
			System.out.println(phoneString+" is not a valid phone number");
		}
		
		//email id 
		String emailString = "kowsi@gmail.com";
		Pattern pattern1 = Pattern.compile("^[A-Za-z0-9]+@[a-z]+[.]{1}[a-z]+$");
		
		Matcher matcher1 = pattern1.matcher(emailString);
		
		if(matcher1.matches()) {
			System.out.println(emailString+" is a valid emailString id");
		}else {
			System.out.println(emailString+" is not a valid emailString id");
		}
	}

	//email
	//"^[A-Za-z0-9]+@(.+)[a-z]+$"
}
