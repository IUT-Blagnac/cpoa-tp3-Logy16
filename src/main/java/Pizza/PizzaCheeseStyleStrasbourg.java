package Pizza;
public class PizzaCheeseStyleStrasbourg extends Pizza {
	
	
	public PizzaCheeseStyleStrasbourg() {
		this.name = "Pizza Strasbourg style with cheese";
		this.garnitures.add(" Mozzarella");
	}
		
	public void cut() {
		System.out.println("Cut in square portions");
	}
}
