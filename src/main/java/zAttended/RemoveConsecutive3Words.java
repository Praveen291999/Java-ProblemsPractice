package zAttended;

import java.util.ArrayList;
import java.util.List;

public class RemoveConsecutive3Words {
	
	private static List<String> splitString(String a) {

		//String[] a1=a.split("\\s+") ;
		
		List<String> list1=new ArrayList<>();
		
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<a.length();i++) {
			//char[] char1=new char[a.length()];
			if(a.charAt(i)==' ') {
				list1.add(builder.toString());
				builder=new StringBuilder();
			}else {
				builder.append(a.charAt(i));
			}
		}
		list1.add(builder.toString());
		
		return list1;
	}

	public static void main(String[] args) {
		String a = "Every morning I want to do exercise regularly";
		String b = "Every morning I want to do meditation without fail";
		String c = "It is important that I want to be happy always";

		List<String> aSplit = splitString(a);
		List<String> bSplit = splitString(b);
		List<String> cSplit = splitString(c);
		
		for (int i=0;i<a.length();i++) {
			for (int j=0;j<b.length();j++) {
				for (int k=0;k<c.length();k++) {
				
				}
			}
		}
	}

}
