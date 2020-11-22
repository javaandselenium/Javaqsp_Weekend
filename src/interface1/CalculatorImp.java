package interface1;

public class CalculatorImp implements Calculator {

	@Override
	public void add() {
	int a=10;
	int b=20;
	System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		CalculatorImp c=new CalculatorImp();
		c.add();
	}

}
