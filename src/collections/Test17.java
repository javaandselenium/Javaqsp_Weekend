package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test17 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(90);
		a.add(60);
		a.add(30);
		a.add(50);
		System.out.println("Beforing sorting "+a);
		Collections.sort(a);
		System.out.println("After sorting the list in ascending order "+a);
      Collections.sort(a,Collections.reverseOrder());
      System.out.println("After sorting reverse order "+a);
	}

}
