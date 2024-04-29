package practice.cloudTechJava;

import java.util.Arrays;
import java.util.List;

public class VowelsCountInString {

	public static void main(String[] args) {
		String words = "Java Programming";
		String lowerCaseString = words.toLowerCase();
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

		// mapToObj(a -> (char) a): Maps the IntStream to a stream of characters
		// by casting each integer value to its corresponding character value.
		long b = lowerCaseString.chars().mapToObj(a -> (char) a).filter(vowels::contains).count();
		//long b=lowerCaseString.chars().mapToObj(v->(char)v).filter(a->vowels.contains(a)).count();
		System.out.println(b);
	}
}
