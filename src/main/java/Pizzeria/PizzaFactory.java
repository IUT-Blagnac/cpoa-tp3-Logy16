package Pizzeria;

import Pizza.Pizza;
import Pizza.PizzaCheese;
import Pizza.PizzaGrecque;
import Pizza.PizzaPoivron;

public abstract class PizzaFactory {

	public Pizza create(String name) {
			Pizza pizza;
			if (name.equals("cheese")) {
				pizza = new PizzaCheese();
			} else if (name.equals("grecque")) {
				pizza = new PizzaGrecque();
			} else {
				pizza = new PizzaPoivron();
			}
			return pizza;
	}
}
