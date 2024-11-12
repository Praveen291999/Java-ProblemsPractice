package expleoGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RoughWork {
	public static void main(String[] args) {
		
		
		//Convert array to list and use removeIf to remove vowels
		char[] ch=new char[] {'h','e','l','l','o'};
		String a=new String(ch);
		List<Character>  chlist=a.chars().mapToObj(ch1->(char)ch1).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(chlist);
		
		List<Character> vowels= Arrays.asList('a','e','i','o','u');
		chlist.removeIf(charat->vowels.contains(charat));
		
		System.out.println(chlist);
		
		
		
	}

}
