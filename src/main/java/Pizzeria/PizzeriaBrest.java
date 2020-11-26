package Pizzeria;
import Pizza.Pizza;
import Pizza.PizzaCheeseStyleBrest;
import Pizza.PizzaGrecqueStyleBrest;
import Pizza.PizzaPoivronStyleBrest;

public class PizzeriaBrest extends Pizzeria {

	
	public PizzeriaBrest() {
		super(PizzaFactoryBrest.getInstance());
	}
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("cheese")) {
			pizza = new PizzaCheeseStyleBrest();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleBrest();
		} else {
			pizza = new PizzaPoivronStyleBrest();
		}
		return pizza;
	}
}
