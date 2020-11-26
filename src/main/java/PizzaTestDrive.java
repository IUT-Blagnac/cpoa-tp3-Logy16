import Pizza.Pizza;
import Pizzeria.Pizzeria;
import Pizzeria.PizzeriaFactory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		Pizzeria shopFromBrest = PizzeriaFactory.getInstance().create("Brest");
		Pizzeria shopFromStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");

		Pizza pizza = shopFromBrest.orderPizza("cheese");
		System.out.println("JMB has ordered a " + pizza.getName() + "\n");

		pizza = shopFromStrasbourg.orderPizza("cheese");
		System.out.println("JMI has ordered a " + pizza.getName() + "\n");

	}
}
