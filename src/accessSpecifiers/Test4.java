package accessSpecifiers;

public class Test4 {
	protected int a=20;
	
	protected void mul() {
		System.out.println("protected method");
	}
	
	protected Test4() {
		System.out.println("protected constructor");
	}

	public static void main(String[] args) {
		Test4 t=new Test4();
		System.out.println(t.a);
		t.mul();

	}

}
