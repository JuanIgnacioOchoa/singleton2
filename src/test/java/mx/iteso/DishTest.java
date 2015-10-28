package mx.iteso;

import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 27/10/2015.
 */
public class DishTest {
    public Dish dish = new Dish();
    @Before
    public void setUp(){
        dish.setName("Enchiladas");
        dish.setPrice((float) 80.0);
        dish.setWaiter("Waiter A");
        dish.setDescription("Sin queso y sin mucho picante");
    }
    @Test
    public void TestDescription(){
        assertEquals(dish.getDescription(), "Sin queso y sin mucho picante");
    }
    @Test
    public void TestPrice(){
        float p = (float) 80.0;
        assertEquals(dish.getPrice(),p,0.0);
    }
    @Test
    public void TestName(){
        assertEquals(dish.getName(),"Enchiladas");
    }
    @Test
    public void TestWaiter(){
        assertEquals(dish.getWaiter(),"Waiter A");
    }
}
