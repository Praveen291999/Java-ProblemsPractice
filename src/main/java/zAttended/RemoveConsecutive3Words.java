package zAttended;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveConsecutive3Words {
	
	private static List<String> splitString(String a) {

		//String[] a1=a.split("\\s+") ;
		
		List<String> list=new ArrayList<>();
		
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ') {
				list.add(builder.toString());
				//reset the Stringbuilder for the next String
				builder=new StringBuilder();
			}else {
				builder.append(a.charAt(i));
			}
		}
		list.add(builder.toString());
		
		return list;
	}

	public static void main(String[] args) {
		String a = "Every morning I want to do exercise regularly";
		String b = "Every morning I want to do meditation without fail";
		String c = "It is important that I want to be happy always";
		
		List<String> aSplit = splitString(a);
		List<String> bSplit = splitString(b);
		List<String> cSplit = splitString(c);
		
		System.out.println(aSplit);
		System.out.println(bSplit);
		System.out.println(cSplit);
		
		List<String> commonList=new ArrayList<>();
		commonList.addAll(aSplit);
		commonList.addAll(bSplit);
		commonList.addAll(cSplit);
		
		Map<String, Long> aSplitOccurence=WordOccurence(commonList);
		System.out.println(aSplitOccurence);
		
	}

	private static Map<String, Long> WordOccurence(List<String> aSplit) {
		
		  Map<String, Long> wordCountMap = aSplit.stream()
			        .collect(Collectors.groupingBy(
			           w->w,
			            LinkedHashMap::new,
			            Collectors.counting()
			        ));
		  
		  return wordCountMap;
	}

}
