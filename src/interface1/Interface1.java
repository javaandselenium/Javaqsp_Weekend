package interface1;

public interface Interface1 {
void home();
}

interface Interface2 {
void car();
}

interface Interface3 {
void cycle();
}

class Child implements Interface1,Interface2,Interface3 {

	@Override
	public void car() {
		System.out.println("car");
		
	}

	@Override
	public void home() {
	System.out.println("home");
		
	}

	@Override
	public void cycle() {
		System.out.println("cycle");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.car();
		c.home();
		c.cycle();
	}
	
	
	
}