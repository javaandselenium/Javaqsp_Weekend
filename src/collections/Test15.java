package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test15 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(90);
		a.add(60);
		a.add(30);
		a.add(50);
		System.out.println("Before suffleing "+a);
		Collections.shuffle(a);
		System.out.println("After suffleing "+a);

	}

}
