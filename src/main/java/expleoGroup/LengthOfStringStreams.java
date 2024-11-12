package expleoGroup;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class LengthOfStringStreams {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vikram", "Vishal", "Arun", "Vijay");

		Map<String, Integer> namesMap = names.stream().collect(Collectors.toMap(name -> name, name -> name.length()));
		System.out.println(namesMap);
		
		//Iterating the map
		
//		for(Map.Entry<String, Integer> entry:namesMap.entrySet()) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//			
//		}
		
		//Using forEach
		
//		namesMap.forEach((name, length) -> {
//			System.out.println(name + "-" + length);
//		});
		
	}

}
