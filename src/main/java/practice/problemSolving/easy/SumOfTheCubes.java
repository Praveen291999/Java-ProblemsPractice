package practice.problemSolving.easy;

import java.util.Scanner;

/*
 * Input: M=2  N=5
 *8+27+64
 * M should not be lesser than the N -> if so print 0
 * 
 * Find the sum of the cubes. o/p:224
 * 
 */

public class SumOfTheCubes {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the m value: ");
		int m = s.nextInt();
		System.out.println("Enter the n value: ");
		int n = s.nextInt();
		int sum = 0;
		int mul;
		if (m < n) {

			while (m <= n) {
				// mul=Math.pow(m, 3);
				mul = m * m * m;
				sum = sum + mul;
				m++;
			}
			System.out.println(sum);

		} else {
			System.out.println(0);
		}

	}

}
