package collections;

import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector t=new Vector();
		t.add(10);
		t.add(34.45);
		t.add("Hello");
		t.add(true);
		t.add("Hello");
		t.add(10);
		t.add(34.45);
		t.add("Hello");
		t.add(true);
		t.add("Hello");
		t.add(true);
		t.add(10);
		t.add(34.45);
		t.add("Hello");
		t.add(true);
		t.add("Hello");
		t.add(10);
		t.add(34.45);
		t.add("Hello");
		t.add(true);
		t.add(true);
		
		
		
		System.out.println("The size of the array is "+t.size());
		for(int i=0;i<t.size();i++) {
			System.out.println(t.get(i));
		}
		System.out.println("the capacity of the vector list is "+t.capacity());

	}

}
