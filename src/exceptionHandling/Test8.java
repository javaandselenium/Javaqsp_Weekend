package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
	
	public void demo() throws FileNotFoundException {
		FileInputStream f=new FileInputStream("./abc");
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Test8 t=new Test8();
		try {
		t.demo();
		}
		catch(Exception e) {
		System.out.println("handled");	
		}
		System.out.println("java");

	}

}
