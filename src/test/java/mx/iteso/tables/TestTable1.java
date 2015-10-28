package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

/**
 * Created by Juan on 27/10/2015.
 */
public class TestTable1 {
    private TableOrder uniqueInstance;

    @Before
    public void SetUp(){
        uniqueInstance = Table1.getInstance();
    }
    @Test public void Table1Test(){
        assertEquals(uniqueInstance.tableName, "Table 1");
    }
    @Test
    public void addDrinkTest () {
        Drink drink = mock(Drink.class);
        uniqueInstance.addDrink(drink);
        assertEquals(uniqueInstance.drinks.get(0).hashCode(), drink.hashCode());
    }
    @Test
    public void addDishTest () {
        Dish dish = mock(Dish.class);
        uniqueInstance.addDish(dish);
        assertEquals(uniqueInstance.dishes.get(0).hashCode(), dish.hashCode());
    }

    @Test
    public void clearDrinksTest(){
        Drink drink = mock(Drink.class);
        uniqueInstance.addDrink(drink);
        uniqueInstance.clearDrinks();
        assertEquals(uniqueInstance.drinks.size(), 0);
    }
    @Test
    public void clearDishes(){
        Dish dish = mock(Dish.class);
        uniqueInstance.addDish(dish);
        uniqueInstance.clearDishes();
        assertEquals(uniqueInstance.dishes.size(),0);
    }
    @Test
    public void clearOrderTest(){
        Dish dish = mock(Dish.class);
        uniqueInstance.addDish(dish);
        Table1.clearOrder();
        uniqueInstance = Table1.getInstance();
        assertEquals(uniqueInstance.dishes.size(), 0);
    }
}
