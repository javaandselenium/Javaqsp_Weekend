package blocks;

public class Test1 {
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("Non static");
	}
	
	Test1()
	{
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		Test1 t=new Test1();
	}

}
