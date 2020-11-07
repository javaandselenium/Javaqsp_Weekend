package methods;

public class Test5 {
	public void send(String pictures)
	{
		System.out.println("shareing pictures");
	}
	
	public void send(String video ,String location)
	{
		System.out.println("video and location");
	}
	
	public void send(int contact, String docs,String text,String gif)
	{
		System.out.println("contact,docs,text.gif");
	}
	
	public void send(String emoji,int numb)
	{
		System.out.println("emoji");
	}
	
	public static void main(double args)
	{
		System.out.println("bye");
	}
	
	public static void main(int args,String abc)
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Test5 t=new Test5();
		t.send("video", "location");
		t.send("pictures");
		Test5.main(90.099);

	}

}
