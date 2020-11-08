package conditionalstatements;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter the marks");
		int marks=s.nextInt();
		
		if(marks>=70)
		{
			System.out.println("Eligibale for interview");
		}
		
		else if(marks<70)
		{
			System.out.println("Wait for another interview");
		}
		
		else
		{
			System.out.println("go home");
		}
		

	}

}
