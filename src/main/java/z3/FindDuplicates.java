package z3;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {

	public static ArrayList<Integer> duplicates(int arr[], int n) {

		ArrayList<Integer> duplicates = new ArrayList<>();
		HashSet<Integer> setValues = new HashSet<>();

		for (int num : arr) {
			if (setValues.contains(num)) {
				duplicates.add(num);
			} else {
				setValues.add(num);
			}
		}
		if (duplicates.isEmpty()) {
			duplicates.add(-1);
		}

		return duplicates;

	}

	public static void main(String[] args) {
		int a[] = { 3, 3, 4, 8, 8, 6 };
		int n = 6;
		ArrayList<Integer> result = new ArrayList<>();
		result = duplicates(a, n);
		System.out.println(result);

	}

}
