package exceptionHandling;

public class Test1 {
	public void add(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
	String[] s=new String[4];
	s[0]="Ram";
	s[1]="Jam";
	s[2]="Dam";
	s[3]="Sam";
	try {
	s[4]="Pam";
	}
	
	catch(Exception e) {
		System.out.println("Handled");
	}
	
		Test1 t=new Test1();
		t.add(10,30);

	}

}
