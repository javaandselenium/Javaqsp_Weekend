package collections;

import java.util.PriorityQueue;

public class Test5 {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.add(100);
		p.add(20);
		p.add(40);
		p.add(500);
		p.add(10);
		System.out.println("The complete array "+p);
		System.out.println("After using poll method "+p.poll());
		System.out.println("After reduceing size by 1 "+p);
		System.out.println("After using poll method "+p.poll());
		System.out.println("After reduceing size by 1 "+p);
	}

}
