package z2;

import java.util.Arrays;

public class MultiplyTwoPolynomials {
	
	public static int[] polyMultiply(int Arr1[], int Arr2[], int M, int N) {
		  int resultLen = M + N - 1; // Length of the resultant array (product polynomial)
		  int[] result = new int[resultLen]; // Initialize result array with zeros

		  // Implement nested loop for multiplying each term of Arr1 with each term of Arr2
		  for (int i = 0; i < M; i++) {
		    for (int j = 0; j < N; j++) {
		      int currIndex = i + j; // Index for placing the product term in the result array
		      result[currIndex] += Arr1[i] * Arr2[j]; // Add (coefficient1 * coefficient2) to the result
		    }
		  }

		  return result;
		}

	public static void main(String[] args) {
		int m=4;
		int n=3;
		int[] arr1= {1,0,3,2};
		int[] arr2= {2,0,4};
		int a[]=polyMultiply(arr1, arr2, m, n);
		System.out.println(Arrays.toString(a));
	}

}
