package Arrays;

public class Test3 {

	public static void main(String[] args) {
		double arr[]=new double[4];
		arr[0]=10.00;
		arr[1]=20.00;
		arr[2]=30.00;
		arr[3]=40.00;
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse order");

		for(int i=3;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}

}
