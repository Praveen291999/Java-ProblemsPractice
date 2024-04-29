package zi1;

public class RemoveDuplicates {
	private static int remove_duplicate(int[] sortedArray, int n) {
		
		int j=0;
		for(int i=1;i<n;i++) {
			if(sortedArray[j]!=sortedArray[i]) {
				j++;
				sortedArray[j]=sortedArray[i];
			}
		}
		return j+1;

	}

	public static void main(String[] args) {

		int[] sortedArray = new int[] {1,1,2,2,4};
		int n = 5;
		int a=remove_duplicate(sortedArray, n);
		System.out.println(a);
	}

}
