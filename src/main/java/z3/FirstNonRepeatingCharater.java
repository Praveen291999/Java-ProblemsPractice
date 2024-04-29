package z3;

import java.util.HashMap;

public class FirstNonRepeatingCharater {

	private static char firstNonRepeatingchar(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char char1 = s.charAt(i);
			map.put(char1, map.getOrDefault(char1, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.get(c) == 1) {
				return c;
			}
		}
		return '$';

	}

	public static void main(String[] args) {
		String s = "hello";
		char a = firstNonRepeatingchar(s);
		System.out.println(a);

	}

}
