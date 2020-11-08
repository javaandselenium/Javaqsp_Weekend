package loops;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name ,age and salary");
		//String input
		String name = s.nextLine();
		System.out.println(name);
		//integer input
		int age=s.nextInt();
		System.out.println(age);
		//double int
		double salary=s.nextDouble();
		System.out.println(salary);
		
		

	}

}
