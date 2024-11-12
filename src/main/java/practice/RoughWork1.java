package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RoughWork1 {
	public static void main(String[] args) {
		List<Integer> a= IntStream.range(2024, 2024+4).boxed().toList();
		a.stream().forEach(g->System.out.println(g));
		System.out.println("**********");
		int b=a.stream().max(Integer::compareTo).orElse(null);
		System.out.println(b);
		//
		
		int minelem=a.stream().mapToInt(Integer::intValue).min().orElseThrow();
		System.out.println(minelem);
		
		
	
	}
}
