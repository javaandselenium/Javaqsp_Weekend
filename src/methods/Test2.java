package methods;

public class Test2 {
	
	String Name="Ramesh";
	String BankName="ICICI";
	int amount=1000;
	int withdrawamt=500;
	
	public void withdrawal()
	{
		int balance=amount-withdrawamt;
		System.out.println(balance);
	}
	
public static void main(String[] args) {
		Test2 a=new Test2();
		a.withdrawal();

	}

}
