package Pizzeria;

import Pizza.Pizza;
import Pizza.PizzaCheeseStyleStrasbourg;
import Pizza.PizzaGrecqueStyleStrasbourg;
import Pizza.PizzaPoivronStyleStrasbourg;

public class PizzaFactoryStrasbourg extends PizzaFactory{
	
	private static PizzaFactoryStrasbourg uniqueInstance = new PizzaFactoryStrasbourg();

	private PizzaFactoryStrasbourg() {
		
		
	}
	public static PizzaFactoryStrasbourg getInstance() {
		return uniqueInstance;
	}
	
	public Pizza create(String name) {
		Pizza pizza;
		if (name.equals("cheese")) {
			pizza = new PizzaCheeseStyleStrasbourg();
		} else if (name.equals("grecque")) {
			pizza = new PizzaGrecqueStyleStrasbourg();
		} else {
			pizza = new PizzaPoivronStyleStrasbourg();
		}
		return pizza;
	}
}
