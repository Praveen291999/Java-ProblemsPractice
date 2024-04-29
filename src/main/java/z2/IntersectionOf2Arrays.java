package z2;

import java.util.HashMap;

public class IntersectionOf2Arrays {

	public static int intersectionElements(int[] a, int[] b, int n, int m) {
		if (n > m) {
			return intersectionElements(b, a, m, n); // Swap arrays if n > m
		}

		// Use a hash table to store the counts of elements in array b
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : b) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int count = 0;
		for (int num : a) {
			if (map.containsKey(num) && map.get(num) > 0) {
				count++;
				map.put(num, map.get(num) - 1);
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		int[] a = { 4, 5, 3, 8, 9 };
		int[] b = { 1, 7, 8 };
		System.out.println(intersectionElements(a, b, n, m));
	}

}
