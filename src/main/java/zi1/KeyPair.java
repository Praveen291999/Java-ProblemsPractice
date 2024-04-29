package zi1;

import java.util.HashSet;

public class KeyPair {
	public static boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			int diff = x - arr[i];
			if (set.contains(diff)) {
				return true;
			}
			set.add(arr[i]);
		}
		return false;

	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 3, 45, 6, 10, 8 };
		int x1 = 18;
		System.out.println(hasArrayTwoCandidates(arr1, arr1.length, x1)); // Should print true

		int[] arr2 = { 1, 2, 4, 3, 6 };
		int x2 = 1;
		System.out.println(hasArrayTwoCandidates(arr2, arr2.length, x2)); // Should print true
	}

}
