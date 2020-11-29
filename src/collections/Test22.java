package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test22 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(10);
		a.add(40);
		a.add(60);
		a.add(20);
		a.add(50);
		Iterator itr = a.iterator();
		while(itr.hasNext())
		{
			 Object o = itr.next();
			System.out.println(o);
		}
		
		
	}

}
