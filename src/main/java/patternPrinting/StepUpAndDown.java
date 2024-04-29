package patternPrinting;

//n=5
//             i(rows)  j(columns)
//*            1
//**           2
//***          3
//****         4
//*****        5
//****         6
//***          7
//**           8
//*            9
// formula :2 * n-i
public class StepUpAndDown {
	public static void main(String[] args) {

		int n = 5;
		int i;
		int j;

		for (i = 1; i <= 2 * n ; i++) {
			if (i <= n) {
				for (j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (j = 1; j <= 2 * n-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
