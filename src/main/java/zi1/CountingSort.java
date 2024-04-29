package zi1;

public class CountingSort {

    public static String sort(String str1) {
    	String str=str1.toLowerCase();
    	int n=str.length();
    	//initialize all the values to 0
    	int count[]=new int[26];
    	
    	//getting the count occurrence 
    	for(int i=0;i<n;i++) {
    		int temp=(int)str.charAt(i)-97;
    		count[temp]++;
    	}
    	
    	StringBuilder result=new StringBuilder();
    	//converting occurence to characters ascii-chara 
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < count[i]; j++) { // for traversing each character
				result.append((char)(i+97));
				
			}
		}
		return result.toString();
       
    }

    public static void main(String[] args) {
      String a="JavaProgramming";
       String result= sort(a);

        System.out.println("Sorted character array: " + result);
    }
}
