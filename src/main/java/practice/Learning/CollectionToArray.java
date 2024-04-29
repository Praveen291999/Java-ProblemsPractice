package practice.Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

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
		
		Object[] a=greeting.toArray();
		System.out.println("********");
		System.out.println(a.toString());
		
	}

}
