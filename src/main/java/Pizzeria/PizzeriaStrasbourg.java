package Pizzeria;
import Pizza.Pizza;
import Pizza.PizzaCheeseStyleBrest;
import Pizza.PizzaCheeseStyleStrasbourg;
import Pizza.PizzaGrecqueStyleBrest;
import Pizza.PizzaGrecqueStyleStrasbourg;
import Pizza.PizzaPoivronStyleBrest;
import Pizza.PizzaPoivronStyleStrasbourg;

public class PizzeriaStrasbourg extends Pizzeria{
	

	public PizzeriaStrasbourg() {
		super(PizzaFactoryStrasbourg.getInstance());
	}

	@Override
	Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("cheese")) {
			pizza = new PizzaCheeseStyleStrasbourg();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleStrasbourg();
		} else {
			pizza = new PizzaPoivronStyleStrasbourg();
		}
		return pizza;
	}
}
