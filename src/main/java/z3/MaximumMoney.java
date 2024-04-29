package z3;

public class MaximumMoney {

	private static int maximizeMoney(int N, int K) {

		if (N % 2 == 0) {
			return ((N / 2) * K);
		} else {
			return ((N / 2 + 1) * K);
		}

	}

	public static void main(String[] args) {
		int n = 5; // houses
		int k = 10; // money
		int a = maximizeMoney(n, k);
		System.out.println(a);
	}

}
