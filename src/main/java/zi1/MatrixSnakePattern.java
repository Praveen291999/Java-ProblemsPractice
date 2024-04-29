package zi1;

import java.util.ArrayList;

//If i->even increment and if i->odd decrement
public class MatrixSnakePattern {
	
	public static ArrayList<Integer> snakePattern(int matrix[][]) {
		
		int n=matrix.length;
		System.out.println(n);
		ArrayList<Integer> traversedList=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<n;j++) {
					traversedList.add(matrix[i][j]);
				}
			}
			else {
				for(int j=n-1;j>=0;j--) {
					traversedList.add(matrix[i][j]);
				}
				
			}
		}
		return traversedList;

	}
	public static void main(String[] args) {
		int[][] n = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		//int[][] n=new int[3][3];
		ArrayList<Integer> result=snakePattern(n);
		System.out.println(result);
	}

}
