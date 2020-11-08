package conditionalstatements;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		if(age>=18)
		{
		System.out.println("DL eligiable");	
		}
		else
		{
			System.out.println("not eligible");
		}

	}

}
