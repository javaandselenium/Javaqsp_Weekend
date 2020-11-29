package collections;

import java.util.TreeSet;

import com.sun.source.util.Trees;

public class Test19 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(40);
		t.add(30);
		t.add(50);
		t.add(90);
		System.out.println(t);
		System.out.println(t.descendingSet());

	}

}
