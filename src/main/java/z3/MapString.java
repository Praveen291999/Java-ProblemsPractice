package z3;

import java.util.HashMap;

public class MapString {

	public static boolean mapString(String str1, String str2) {

		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			char char1 = str1.charAt(i);
			char char2 = str2.charAt(i);

			if (!map.containsKey(char1)) {
				map.put(char1, char2);
			} else if (map.get(char1) != char2) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		String str1 = "add";
		String str2 = "egg";

		boolean result1 = mapString(str1, str2);
		boolean result2 = mapString(str2, str1);

		System.out.println(result1 && result2);
	}
}
