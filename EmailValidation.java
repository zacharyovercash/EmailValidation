package email;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	// A-Z permitted
	// a-z permitted
	// 0-9 permitted
	// _,- permitted
	// no special characters permiteed

	public static final String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean found = false;
		ArrayList<String> lst = new ArrayList<String>();

		lst.add("amar@mail.com");
		lst.add("Zach@mail.com");
		lst.add("scottlee@aol.com");
		lst.add("thassine@mac.com");
		lst.add("bradl@comcast.net");
		lst.add("mccurley@msn.com");
		lst.add("jginspace@comcast.net");
		lst.add("osrin@me.com");
		

		System.out.println("Enter the Email you wish to search for");
		String mail = in.next();

		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher(mail);

		
		if(matcher.matches()==true){
			System.out.println("email "+mail+" is valid");
			
			for (String test : lst) {
				if (mail.equals(test)) {
					found = true;
				}
			}
			
			
			if(found==true){
				System.out.println(mail + " is found");
			}
			else{
				System.out.println(mail+" was not found");
			}
		}else{
			System.out.println("email is invalid");
		}
		
		

	}

}
