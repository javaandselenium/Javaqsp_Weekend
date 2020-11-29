package collections;

import java.util.ArrayList;

public class Test23 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(40);
		a.add(60);
		a.add(20);
		a.add(50);
		
		System.out.println("Using enchanced loop");
		for(Object abc:a) {
			System.out.println(abc);
			
		}
		
		System.out.println("Using for loop");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
			
		}

	}

}
