package zAttended;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {
 
		List<List<String>> commonList = new ArrayList<>();
 
		List<String> myList = new ArrayList<>();
 
		String a = "Every morning I want to do exercise regularly";
		String b = "Every morning I want to do meditation without fail";
		String c = "It is important that I want to be happy always";
 
		myList.add(a);
		myList.add(b);
		myList.add(c);
 
		List<String> wordListof1 = new ArrayList<>();
		List<String> wordListof2 = new ArrayList<>();
		List<String> wordListof3 = new ArrayList<>();
 
		System.out.println(myList);
 
		Map<String, Integer> myMap = new LinkedHashMap<>();
		int setter = 1;
		for (String xyz : myList) {
			String l = "";
			for (char x : xyz.toCharArray()) {
				if (x != ' ') {
					l += x;
				}
				if (x == ' ') {
					if (setter == 1)
						wordListof1.add(l);
					else if (setter == 2) {
						wordListof2.add(l);
					} else {
						wordListof3.add(l);
					}
					if (myMap.containsKey(l)) {
						myMap.put(l, myMap.get(l) + 1);
					} else {
						myMap.put(l, 1);
					}
					l = "";
				}
 
			}
			setter++;
		}
 
		commonList.add(wordListof1);
		commonList.add(wordListof2);
		commonList.add(wordListof3);
		List<String> ll = new ArrayList<>();
		for (Map.Entry<String, Integer> x : myMap.entrySet()) {
			if (x.getValue() == myList.size()) {
				ll.add(x.getKey());
			}
		}
		String s = ll.get(0); // I
 
		for (List<String> ppp : commonList) {
			for (int i = 0; i < ppp.size() - ll.size(); i++) {
				if (ppp.get(i).equals(s) && ppp.get(i + 1).equals(ll.get(1)) && ppp.get(i + 2).equals(ll.get(2))) {
					for (int k = 0; k < ll.size(); k++) {
						ppp.remove(i);
					}
 
				}
			}
		}
		System.out.println(commonList);
	}
}