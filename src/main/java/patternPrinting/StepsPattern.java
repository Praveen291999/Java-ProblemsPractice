package patternPrinting;

//* 
//* * 
//* * * 
//* * * * 
//* * * * *

//1
//22
//333
//4444
//55555
//666666  for this we can just print the row value

//1
//12
//123
//1234
//12345
//123456  fro thsi print the column value



//int n=5;
//for(int i=0;i<n;i++) {
//	for(int j=0;j<=i;j++) {
//		System.out.print("A");
//	}
//	System.out.println();
//}
public class StepsPattern {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) { //using <= to make sure the loop goes till n
				System.out.print("*");		
			}
			System.out.println();
		}
	}
}

