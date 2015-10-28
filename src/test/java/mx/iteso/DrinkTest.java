package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 27/10/2015.
 */
public class DrinkTest {
    public Drink drink = new Drink();
    @Before
    public void setUp(){
        drink.setName("Coke");
        drink.setPrice((float) 8.0);
        drink.setWaiter("Waiter B");
        drink.setDescription("Al tiempo y sin vaso");
    }
    @Test
    public void TestDescription(){
        assertEquals(drink.getDescription(), "Al tiempo y sin vaso");
    }
    @Test
    public void TestPrice(){
        assertEquals(drink.getPrice(),8.0,0.0);
    }
    @Test
    public void TestName(){
        assertEquals(drink.getName(),"Coke");
    }
    @Test
    public void TestWaiter(){
        assertEquals(drink.getWaiter(),"Waiter B");
    }
}
