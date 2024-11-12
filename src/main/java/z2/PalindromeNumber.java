package z2;

public class PalindromeNumber {
	
	private static void palindromeCheck(int n) {
		int copy=n;
		int rev = 0;
		while(n!=0) {
			//gives the remainder
			rev=(rev*10)+(n%10);
			n=n/10;//every time elimnates the last value
		}
		if(rev==copy) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
	public static void main(String[] args) {
		int n=11611;
		palindromeCheck(n);
		
		
	}

	

}
