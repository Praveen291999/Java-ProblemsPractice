package z3;

public class PalindromeString {

	private static int palindromeCheck(String S) {

		StringBuilder str = new StringBuilder();
		for (int i = S.length()-1; i >= 0; i--) {
			str.append(S.charAt(i));
		}
		if ((str.toString()).equals(S)) {
			return 1;
		} else {
			return 0;
		}
		

	}

	public static void main(String[] args) {
		String str = "bobs";
		int a=palindromeCheck(str);
		System.out.println(a);
	}	

}
