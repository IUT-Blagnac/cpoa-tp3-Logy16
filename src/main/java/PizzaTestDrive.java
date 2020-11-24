
public class PizzaTestDrive {

	public static void main(String[] args) {
		Pizzeria shopFromBrest = PizzeriaFactory.getInstance().createPizza("Brest");
		Pizzeria shopFromStrasbourg = PizzeriaFactory.getInstance().createPizza("Strasbourg");

		Pizza pizza = shopFromBrest.orderPizza("cheese");
		System.out.println("JMB has ordered a " + pizza.getName() + "\n");

		pizza = shopFromStrasbourg.orderPizza("cheese");
		System.out.println("JMI has ordered a " + pizza.getName() + "\n");

	}

}
