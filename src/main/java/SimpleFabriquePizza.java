
public class SimpleFabriquePizza {
	 public Pizza creerPizza(String type) {

		 Pizza pizza;
			if (type.equals("fromage")) {
				pizza = new PizzaFromage();
			} else if (type.equals("grecque")) {
				pizza = new PizzaGrecque();
			} else {
				pizza = new PizzaPoivrons();
			}
			return pizza;
	 }
}
