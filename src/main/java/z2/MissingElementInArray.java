package z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInArray {
	
	private static int missingNumber(int[] a, int n) {
		
		Arrays.sort(a);
		List<Integer> allValues=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			allValues.add(i);
		}
		List<Integer> originalList=new ArrayList<>();
		for(int i:a) {
			originalList.add(i);
		}
		int k=0;
		for(int num:allValues) {
			if(!originalList.contains(num)) {
				
				k=k+num;
			}
			
		}
		return k;
	}

	public static void main(String[] args) {
		int n=7;
		int[] a= {1,6,2,4,3,7};
		int result=missingNumber(a,n);
		System.out.println(result);
	}

	
}
