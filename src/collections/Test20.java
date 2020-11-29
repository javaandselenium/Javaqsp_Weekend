package collections;

import java.util.HashSet;

public class Test20 {

	public static void main(String[] args) {
		HashSet set1=new HashSet();
		set1.add(100);
		set1.add("hello");
		set1.add('A');
		set1.add(true);
		set1.add(500);
		set1.add(500);
		
		HashSet set2=new HashSet();
		set2.add(10);
		set2.add("hello");
		set2.add('B');
		set2.add(true);
		set2.add(50);
		set2.add(5000);
		set2.retainAll(set1);
		System.out.println(set2);
		
	}

}
