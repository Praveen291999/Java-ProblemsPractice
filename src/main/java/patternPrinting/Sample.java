package patternPrinting;

public class Sample {
	public static void main(String[] args) {
		
		    int n = 6;
		    int i;
		    int j;

		    for (i = 1; i <= 2 * n - 1; i++) {
		        if (i <= n) {
		            for (j = 1; j <= i; j++) {
		                System.out.print("*");
		            }
		        } else {
		            for (j = 1; j <= 2 * n - i; j++) {
		                System.out.print("*");
		            }
		        }
		        System.out.println();
		    }
		}

}
