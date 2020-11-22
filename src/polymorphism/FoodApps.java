package polymorphism;

public class FoodApps {
	public void food() {
		System.out.println("all veg and non-veg food");
	}
}

class UberEats extends FoodApps{
	public void food() {
		System.out.println("Pizza from UberEats");
	}}

class FoodPanda extends FoodApps{
	public void food() {
		System.out.println("Briyani from FoodPanda");
	}
}

class Swiggy extends FoodApps{
	public void food() {
		System.out.println("Burger from Swiggy");
	}
}

class Mainclass5
{
	public static void main(String[] args) {
		FoodApps f=new UberEats();
		f.food();
	}
}

