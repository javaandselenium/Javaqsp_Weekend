package methods;

public class Kitkat {
	public void camera()
	{
		System.out.println("back camera");
	}

}

class Lolipop extends Kitkat{
	public void camera()
	{
		System.out.println("front camera");
		super.camera();
	}
}

class Mainclass0{
	public static void main(String[] args) {
		Lolipop l=new Lolipop();
		l.camera();
	}
}
