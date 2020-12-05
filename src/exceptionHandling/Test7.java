package exceptionHandling;

import java.io.FileInputStream;

public class Test7 {

	public static void main(String[] args) {
		//complie time exp(checked exception)
		try {
		FileInputStream f=new FileInputStream("./abc");
		}
		catch(Exception e)
		{
			
		}
		
		//run time exception (unchecked exception)
		int i=1/0;

	}

}
