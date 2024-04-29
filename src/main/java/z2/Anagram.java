package z2;

import java.util.Arrays;

public class Anagram {
	
	private static boolean anagramCheck(String str1, String str2) {
	if(str1.length()!=str2.length()) {
		return false;
	}
	
	char[] str1char=str1.toCharArray();
	char[] str2char=str2.toCharArray();
	
	Arrays.sort(str1char);
	Arrays.sort(str2char);
	
	return Arrays.equals(str1char, str2char);
	
	}
	public static void main(String[] args) {
		String str1="cat";
		String str2="act";
		boolean result=anagramCheck(str1,str2);
		if (result) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an Anagram");
		}
		
	}

	

}
