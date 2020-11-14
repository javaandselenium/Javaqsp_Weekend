package inhertiance;

public class GrandParent {
	public void car() {
		System.out.println("property of grandparent car");
	}}

class Parents6 extends GrandParent
{
	public void home() {
		System.out.println("home is parent property");
	}
}

class Children extends Parents6{
	public void cycle()
	{
		System.out.println("cycle is from child class");
	}
}


class Mainclass
{
	public static void main(String[] args) {
		Parents6 t=new Parents6();
		t.home();
		t.car();
		
		Children c=new Children();
		c.car();
		c.home();
		c.cycle();
	}
}