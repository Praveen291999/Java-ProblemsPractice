package z2;

public class GCDOf2Numbers {

	private static int gcd(int a, int b) {
		
		//based on euclidean Algorith
		if(b==0) {
			return a;
		}
		
		return gcd(b, a%b);
	}

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		int result = gcd(a, b);
		System.out.println(result);

	}

}
