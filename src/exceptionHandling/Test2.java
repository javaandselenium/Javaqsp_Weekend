package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
		catch(ArithmeticException a) {
			System.out.println("handle AE");
		}
		
		catch(ArrayIndexOutOfBoundsException p) {
			System.out.println("Handled AIOE");
		}
		
		int arr[]= {10,20,30,40};
		System.out.println(arr[2]);

	}

}
