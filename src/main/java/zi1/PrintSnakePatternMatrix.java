package zi1;

public class PrintSnakePatternMatrix {

	public static void snakePattern(int matrix[][]) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			} else {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		int[][] n = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		snakePattern(n);
	}
}
