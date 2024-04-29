package zi1;

public class RemoveCharactersFromString {
	
	static String removeChars(String str1, String str2) {
		
		//initialize all the value to 0
		int arr[]= new int[26];
		
		int index;
		//adding count to array for string2
		for (int i = 0; i < str2.length(); i++) {
			index = (int) str2.charAt(i) - 97;
			arr[index]++;
		}
		StringBuilder strbuilder=new StringBuilder();
		//converting bacj to char and adding to stringBuilder checking with array count 
		for(int i=0;i<str1.length();i++) {
			char currentchar=str1.charAt(i);
			index=(int)currentchar-97;
			if(arr[index]==0) {
				strbuilder.append(currentchar);
			}
		}
		return strbuilder.toString();
		
	}
	
	public static void main(String[] args) {
		String str1 = "computer";
		String str2 = "cat";
		String a=removeChars(str1, str2);
		System.out.println(a);
	}

}
