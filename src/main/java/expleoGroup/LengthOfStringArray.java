package expleoGroup;

import java.util.Arrays;
import java.util.Scanner;

public class LengthOfStringArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size: ");
		int a = s.nextInt();

		String[] names = new String[a];

		for (int i = 0; i < a; i++) {
			names[i] = s.next();
		}

		System.out.println(Arrays.toString(names));

		String[] lenString = new String[a];
		for (int i = 0; i < a; i++) {
			String n=names[i];
			int len=n.length();
			lenString[i]=n + " : "+len;

		}

		System.out.println(Arrays.toString(lenString));
		
		for(String ab:lenString) {
			System.out.println(ab);
		}
	}
}
