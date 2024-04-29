package z3;

public class StringBinaryOrAndXor {
	private static void binaryOperation(String str) {
		
		int ans=Character.getNumericValue(str.charAt(0));
		for(int i=1;i<str.length();i+=2) {
			if(str.charAt(i)=='A') {
				int nextElem=Character.getNumericValue(str.charAt(i+1));
				ans=ans&nextElem;
			}
			else if(str.charAt(i)=='B') {
				int nextElem=Character.getNumericValue(str.charAt(i+1));
				ans=ans|nextElem;
			}
			else if(str.charAt(i)=='C') { 
				int nextElem=Character.getNumericValue(str.charAt(i+1));
				ans=ans^nextElem;
			}
		}
		System.out.println(ans);
		
	}
	public static void main(String[] args) {
		String str="1C0C1C1A0B1";
		binaryOperation(str);
	}

	

}
