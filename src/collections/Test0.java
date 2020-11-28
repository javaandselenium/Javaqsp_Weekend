package collections;

import java.util.ArrayList;

public class Test0 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add("Hello");
	a.add('A');
	a.add("");
	a.add(12.3455);
	a.add(true);
	a.add(10);
	
	for(int i=1;i<a.size();i++) {
		System.out.println(a.get(i));
		
	}
	
	

	}

}
