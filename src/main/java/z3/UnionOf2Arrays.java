package z3;

import java.util.HashSet;

public class UnionOf2Arrays {

	private static int unionOfSet(int[] a, int[] b) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int num1 : a) {
			hashSet.add(num1);
		}

		for (int num2 : b) {
			hashSet.add(num2);
		}

		return hashSet.size();
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 4, 5 };
		int result = unionOfSet(a, b);
		System.out.println(result);
	}

}
