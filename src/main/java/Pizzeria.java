/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {

        /**
         * @param type
         * @return a Pizza object according to the type
         */
		public final Pizza orderPizza(String type) {

			Pizza pizza;
			
			pizza=createPizza(type);
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.wrap();
	
			return pizza;
		}
		
		abstract Pizza createPizza(String type);
}