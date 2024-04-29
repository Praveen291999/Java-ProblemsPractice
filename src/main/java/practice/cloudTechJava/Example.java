package practice.cloudTechJava;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		String words = "Java Programming";
		String lowerCaseString = words.toLowerCase();
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		long b=lowerCaseString.chars().mapToObj(v->(char)v).filter(vowels::contains).count();
		System.out.println(b);
	}
}
