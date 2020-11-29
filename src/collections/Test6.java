package collections;

import java.util.PriorityQueue;

public class Test6 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(100);
		p.add(20);
		p.add(40);
		p.add(500);
		p.add(10);
		System.out.println("The array "+p);
		System.out.println("By using peek method "+p.peek());
		System.out.println("After using peek method "+p);
		

	}

}
