package conditionalstatements;

public class Test5 {

	public static void main(String[] args) {
		int atmpin=1234;
		int balamt=50;
		
		if(atmpin==1234)
		{
			System.out.println("Thank you for crrt pin");
			
			if(balamt>=100)
			{
				System.out.println("withdraw amt");
			}
			else
			{
				System.out.println("invalid amt");
			}
		}
		
		else
		{
			System.out.println("Invalid pin");
		}
		
	}

}
