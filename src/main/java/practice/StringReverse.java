package practice;

import org.springframework.boot.SpringApplication;

//Palindrome or not

public class StringReverse {

	public static void main(String[] args) {
		String str = "MadaM";
		StringBuilder builder = new StringBuilder(str);
		// System.out.println(builder.reverse().toString());
		if (str.equals(builder.reverse().toString())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
		
		
//		char[] charArray=new char[str.length()];
//		charArray=str.toCharArray();
//		System.out.println(charArray);
		

	}

}
