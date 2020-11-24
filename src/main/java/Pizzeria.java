/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {

        /**
         * @param type
         * @return a Pizza object according to the type
         */
		public final Pizza commanderPizza(String type) {

		Pizza pizza;
		pizza=creerPizza(type);
		
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
		}
		
		abstract Pizza creerPizza(String type);
}