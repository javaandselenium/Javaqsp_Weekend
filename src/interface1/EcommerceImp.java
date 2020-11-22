package interface1;

public class EcommerceImp implements Ecommerce{

	@Override
	public void photo() {
		System.out.println("creteing photo module");
		
	}

	@Override
	public void coupon() {
		System.out.println("creteing coupon module");
		
	}

	@Override
	public void discount() {
		System.out.println("creating discount module");
		
	}

	@Override
	public void game() {
	System.out.println("creating game module");
		
	}

public static void main(String[] args) {
	EcommerceImp e=new EcommerceImp();
	e.photo();
	e.coupon();
	e.discount();
	e.game();
}
}
