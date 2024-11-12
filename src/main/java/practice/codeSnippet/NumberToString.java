package practice.codeSnippet;

/*
 * Input:123
 * output:onetwothree
 * 
 * 
 * 
 */

public class NumberToString {

	public static String numToString(int n) {

		String[] str = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String number=String.valueOf(n);
		
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<number.length();i++) {
			char ch=number.charAt(i);
			int num=ch-'0';
			builder.append(str[num]);
		
		}
		return builder.toString();

	}

	public static void main(String[] args) {
		int a=123;
		String s=numToString(a);
		System.out.println(s);

	}

}
