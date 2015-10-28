package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import mx.iteso.singleton.tables.Table2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

/**
 * Created by Juan on 27/10/2015.
 */
public class TestTable2 {
    private TableOrder uniqueInstance;

    @Before
    public void SetUp(){
        uniqueInstance = Table2.getInstance();
    }
    @Test
    public void Table2Test(){
        assertEquals(uniqueInstance.tableName, "Table 2");
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
        Table2.clearOrder();
        uniqueInstance = Table2.getInstance();
        assertEquals(uniqueInstance.dishes.size(), 0);
    }
}
