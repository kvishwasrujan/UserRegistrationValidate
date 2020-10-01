package userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegis {
	private static final String FIRSTNAME = "[A-Z] {1}[a-zA-Z] {2,}";
	private static final String LASTNAME = "[A-Z] {1}[a-zA-Z] {2,}";
	private static final String EMAIL = "^abc([.])?([0-9] {1-3})?@[a-z0-9] {1,}.[a-z] {3}(.[a-z] {2,})?$";
	private static final String PHONENUM = "[1-9] {2}\\s[1-9] {1}[0-9] {9}";
	private static final String PASSWORD = "^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$";

	public boolean validateFirstName(String FirstName) {
		Pattern pattern = Pattern.compile(FIRSTNAME);
		Matcher matcher = pattern.matcher(FirstName);
		boolean check = pattern.matcher(FirstName).matches();
		return check;
	}

	public boolean validateLastName(String LastName) {
		Pattern pattern = Pattern.compile(LASTNAME);
		Matcher matcher = pattern.matcher(LastName);
		boolean check = pattern.matcher(LastName).matches();
		return check;
	}

	public boolean validateEmail(String Email) {
		Pattern pattern = Pattern.compile(EMAIL);
		Matcher matcher = pattern.matcher(Email);
		boolean check = pattern.matcher(Email).matches();
		return check;
	}

	public boolean validatePhoneNum(String PhoneNum) {
		Pattern pattern = Pattern.compile(PHONENUM);
		Matcher matcher = pattern.matcher(PhoneNum);
		boolean check = pattern.matcher(PhoneNum).matches();
		return check;
	}

	public boolean validatePassword(String Password) {
		Pattern pattern = Pattern.compile(PASSWORD);
		Matcher matcher = pattern.matcher(Password);
		boolean check = pattern.matcher(Password).matches();
		return check;
	}

}
