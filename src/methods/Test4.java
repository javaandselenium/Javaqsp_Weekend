package methods;

public class Test4 {
	
	public void add(int a)
	{
	System.out.println("Integer");	
	}
	
	public void add(int a,double b)
	{
		System.out.println("Integer and double");
	}
	
	public void add(int a,double b,float c)
	{
		System.out.println("Integer double and float");
	}
	
	public void add(float c ,double b,int a)
	{
		System.out.println(" float  double and intger");
	}
	
	public static void main(String[] args) {
		Test4 t=new Test4();
		t.add(4,6.988);

	}

}
