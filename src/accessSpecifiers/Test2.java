package accessSpecifiers;

public class Test2 {
	private int a=100;
	
	private void add() {
		System.out.println("Private method");
	}
	
	private Test2() {
		System.out.println("Private constructor");
	}

	public static void main(String[] args) {
	Test2 t=new Test2();
	System.out.println(t.a);
	t.add();
	

	}

}
