package typecasting;

public class Test2 {

	public void coffee() {
		System.out.println("coffee");
	}

	public void milk() {
		System.out.println("milk");
	}
}

class Test3 extends Test2{
	public void tea() {
		System.out.println("tea");
	}

	public void water() {
		System.out.println("water");
	}
}


class Mainclass{
	public static void main(String[] args) {
		Test2 t=new Test3();
		t.coffee();
		t.milk();
		
	}
}
