package collections;

import java.util.LinkedList;

public class Test7 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("APPLE");
		l.add("MANGO");
		l.add("ORANGE");
		l.add("CHERRY");
		System.out.println(l);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}

}
