import java.util.ArrayList;

/**
 * @author bruel (from O'Reilly Head-First series)
 */
public abstract class Pizza {

	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList garnitures;
	
	protected void prepare() {
		System.out.println("Preparation of Pizza with " + sauce + " style sauce ");
		System.out.println("Spread the pizza dough...");
		System.out.println("Add the sauce...");
		System.out.println("Add the garnitures :");
		for(int i=0;i<garnitures.size();i++) {
			System.out.println(garnitures.get(i));
		}
	}

	protected void bake() {
		System.out.println();	
	}

	protected void cut() {
		
	}

	protected void wrap() {
		System.out.println("Put the pizza in the official box");	
	}
	
	public String getName() {
		return name;
	}

}
