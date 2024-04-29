package z2;

public class Replace0To5 {

	private static int ReplaceZeroToFive(int num) {
		
		String nums=Integer.toString(num);
		String copy=nums;
		for(int i=0;i<nums.length();i++) {
			char n=nums.charAt(i);
			if(n=='0') {
				copy=copy.replace("0", "5");
			}
		}
		return Integer.parseInt(copy);
	}

	public static void main(String[] args) {
		int num = 1006;
		int a=ReplaceZeroToFive(num);
		System.out.println(a);
	}

}
