package accessSpecifiers;


public class Test0 {
	
	public int a=10;
	
	public void abc() {
		System.out.println("abc is a public method");
	}
	
	public Test0() {
		System.out.println("public constructor");
	}


	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println(t.a);
		t.abc();
		
		Test3 t1=new Test3();
		System.out.println(t1.a);
		t1.sub();
	}

}
