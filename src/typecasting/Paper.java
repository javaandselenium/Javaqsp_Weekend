package typecasting;



public class Paper {

	public void thickPaper() {
		System.out.println("thickness of thick paper");
	}
	
	public void thinPaper() {
		System.out.println("thickness of the thin paper");
	}

}

class Pen extends Paper{
	public void bluePen() {
		System.out.println("blue color ink");
	}
	
	public void  greenPen() {
		System.out.println("green color ink");
	}
}

class Mainclass1 {
	public static void main(String[] args) {
		Paper p=new Pen();
		p.thickPaper();
		p.thinPaper();
		
		//Downcasting
		Pen p1=(Pen)p;
		p1.bluePen();
		p1.greenPen();
		p1.thickPaper();
		p1.thinPaper();
		
	}
}
