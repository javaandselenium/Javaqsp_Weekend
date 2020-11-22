package interface1;

public class Test1 implements Test0{

	@Override
	public void sub() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.sub();
	}

}
