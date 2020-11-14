package inhertiance;

import inhertiance.Parent;

public class Child extends Parent {
	
	public void cycle() {
		System.out.println("childs cycle");
	}
	
	
	public static void main(String[] args) {
		Child c=new Child();
		c.cycle();
		c.home();
	}

}
