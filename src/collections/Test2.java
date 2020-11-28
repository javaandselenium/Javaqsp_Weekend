package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add("Hello");
		a.add('A');
		a.add("");
		a.add(12.3455);
		a.add(true);
		a.add(10);
		
		a.retainAll(a);
		System.out.println(a);
		a.remove(a);
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);

	}

}
