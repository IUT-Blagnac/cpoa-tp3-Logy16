public class PizzeriaFactory {
	
	private static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	public Pizza createPizza(String type) {

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
	
	public static PizzeriaFactory getInstance() {
		return uniqueInstance;
	}
}
