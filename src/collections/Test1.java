package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("Hello");
		a.add('A');
		a.add("");
		a.add(12.3455);
		a.add(true);
		a.add(10);
		System.out.println(a.size());
		a.add(3,"Bye");
		System.out.println(a);
		a.remove(4);
		System.out.println(a);
		a.clear();
		a.removeAll(a);
		System.out.println(a);

	}

}
