package practice.Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

public class CollectionToArray {
	
	public static void main(String[] args) {
		List<String> greeting=new ArrayList<>();
		greeting.add("Welcome");
		greeting.add("to");
		greeting.add("Java");
		System.out.println(greeting);
		
		Vector<String> vectorGreeting=new Vector<>();
		vectorGreeting.add("Welcome");
		vectorGreeting.add("to");
		vectorGreeting.add("Java");
		System.out.println("********");
		System.out.println(vectorGreeting);
		
		//represent the size of the array; instead,
		//it's just a placeholder indicating that the size is initially zero.
		String[] a=greeting.toArray(new String[0]);
		System.out.println("********");
		//To print array values
		Stream<String> st=Arrays.stream(a);
		st.forEach(System.out::println);
		
	}

}
