package Pizzeria;

public class PizzeriaFactory {
	
	private static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	private PizzeriaFactory() {
		
	}
	
	public static PizzeriaFactory getInstance() {
		return uniqueInstance;
	}
	
	public Pizzeria create(String name) {
		Pizzeria pizzeria=null;
		if(name.equals("Brest")) {
			pizzeria = new PizzeriaBrest();
		}
		if(name.equals("Strasbourg")) {
			pizzeria = new PizzeriaStrasbourg();
		}
		return pizzeria;
	}
}
