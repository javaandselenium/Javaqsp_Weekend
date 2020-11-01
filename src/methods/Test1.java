package methods;

public class Test1 {
	int a=10;
	static int b=20;
	
	public void abc()
	{
		System.out.println("abc");
	}
	
	public static void xyz()
	{
		System.out.println("xyz");
	}
	

	public static void main(String[] args) {
		Test1 t=new Test1();
		t.abc();
		System.out.println(t.a);
		
		Test1.xyz();
		System.out.println(Test1.b);
		

	}

}
