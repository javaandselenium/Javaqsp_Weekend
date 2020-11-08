package conditionalstatements;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the grade");
	    int grade=s.nextInt();
	
	switch(grade)
	{
	case 1:System.out.println("FCD");
	       break;
	case 2:System.out.println("FC");
           break; 
	case 3:System.out.println("SC");
           break; 
	case 4:System.out.println("Fail"); 
	       break;
	 default:System.out.println("invalid option");
	         break;
	       
	}

	}

}
