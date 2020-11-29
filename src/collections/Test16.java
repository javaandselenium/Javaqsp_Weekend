package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test16 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(90);
		a.add(60);
		a.add(30);
		a.add(50);
		System.out.println("Before swapping "+a);
		//Collections.swap(a,0,a.size()-1);
		Collections.swap(a,1,2);
		System.out.println("after swaping "+a);

	}

}
