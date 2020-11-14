package inhertiance;

public class ScientificCalculator extends BasicCalacutor {
	public void sinteta() {
		System.out.println("sinteta");
	}
	
	public void cosetaeta()
	{
		System.out.println("coseteta");
	}
	
	public static void main(String[] args) {
		ScientificCalculator s=new ScientificCalculator();
		s.add();
		s.mul();
		s.sinteta();
		s.div();
		s.cosetaeta();
		
	}

}
