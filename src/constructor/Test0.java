package constructor;

public class Test0 {
	int a=10;
	int b=20;
	//Non parameterized
	Test0()
	{
		System.out.println(a+b);
	}
	
	//parameterized
	Test0(int c,int b)
	{
		System.out.println(c-b);
	}

	public static void main(String[] args) {
		Test0 t=new Test0();
		Test0 t1=new Test0(30,10);

	}

}
