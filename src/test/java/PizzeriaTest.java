import static org.junit.Assert.*;
import org.junit.Test;

import Pizza.Pizza;
import Pizzeria.Pizzeria;
import Pizzeria.PizzeriaBrest;
import Pizzeria.PizzeriaFactory;
import Pizzeria.PizzeriaStrasbourg;

public class PizzeriaTest {

    @Test
    public void anOrderedPizzaIsNotNull() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizza miam = boutiqueBrest.orderPizza("cheese");
        assertNotNull("An Ordered Pizza Is Not Null",miam);
    }

    @Test
    public void twoOrderedPizzasAreDifferent() {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Strasbourg");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");
        Pizza miam1 = boutiqueBrest.orderPizza("cheese");
        Pizza miam2 = boutiqueStrasbourg.orderPizza ("Greek");
        assertNotEquals("Two Ordered Pizzas Are Different",miam1,miam2);
    }
}