package practice;

public class Example2 {
	
	public static void main(String[] args) {
		
		String a="b";
		
		StringtoInt(a);
	}

	private static void StringtoInt(String a) {
		if(a=="Y"||a=="y") {
			System.out.println(1);	
		}else if(a=="N"||a=="n") {
			System.out.println(0);
		}
		
	}

}
