package loops;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String option="";
		while(!option.equalsIgnoreCase("JAVA"))
		{
			System.out.println("Enter the crrt value");
			option=s.nextLine();
		}
		
		System.out.println("hello");
		System.out.println("selenium");

	}

}
