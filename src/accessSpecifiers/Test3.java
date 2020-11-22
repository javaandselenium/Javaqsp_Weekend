package accessSpecifiers;

public class Test3 {
	
	int a=10;
	
	void sub() {
		System.out.println("default method");
	}
	
	Test3(){
		System.out.println("default constructor");
	}

	public static void main(String[] args) {
		Test3 t=new Test3();
		System.out.println(t.a);
		t.sub();
		
		Test4 t1=new Test4();
		System.out.println(t1.a);
		t1.mul();


	}

}
