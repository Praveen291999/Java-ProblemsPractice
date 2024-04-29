package z2;

public class GapSum {
	
	private static void gapSum(int[] a, int gap) {
		int len=a.length;
		
		for(int i=0; i<gap;i++) {
			int sum=0;
			for(int j=i;j<len;j+=gap) {
				sum=sum+a[j];
			}
			System.out.print(sum + " ");
		}
		
	}
	
	public static void main(String[] args) {
		int n=4;
		int a[]= {1,2,3,4,5,6,7,8,9};
		gapSum(a,n);
	}

	
}
