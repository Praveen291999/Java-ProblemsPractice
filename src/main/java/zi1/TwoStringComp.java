package zi1;


	public class TwoStringComp {
	    public static void main(String[] args) {
	        String str1 = "ProgramJavaProger";
	        String str2 = "roge";
	        
	        int index = str1.indexOf(str2);
	        
	        if (index != -1) {
	            System.out.println("Index of '" + str2 + "' in '" + str1 + "': " + index);
	        } else {
	            System.out.println("'" + str2 + "' not found in '" + str1 + "'");
	        }
	    }

}
