package Pizzeria;

import Pizza.Pizza;
import Pizza.PizzaCheeseStyleBrest;
import Pizza.PizzaGrecqueStyleBrest;
import Pizza.PizzaPoivronStyleBrest;

public class PizzaFactoryBrest extends PizzaFactory{

	private static PizzaFactoryBrest uniqueInstance = new PizzaFactoryBrest();
	
	private PizzaFactoryBrest() {
		
	}
	
	public static PizzaFactoryBrest getInstance() {
		return uniqueInstance;
	}
	
	public Pizza create(String name) {
		Pizza pizza;
		if (name.equals("cheese")) {
			pizza = new PizzaCheeseStyleBrest();
		} else if (name.equals("grecque")) {
			pizza = new PizzaGrecqueStyleBrest();
		} else {
			pizza = new PizzaPoivronStyleBrest();
		}
		return pizza;
	}

}
