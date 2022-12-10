import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {
	BevShop myShop = new BevShop();

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
        assertTrue(myShop.toString().contains(""));
	}
	@Test
	void testValidAge()
	{
        assertTrue(myShop.isValidAge(21));
	}
	@Test
	void testIsEligibleForMore()
	{
        assertTrue(myShop.isEligibleForMore());
	}
	@Test
	void testIsMaxFruit()
	{
        equals(myShop.isMaxFruit(6));
	}
	@Test
    void testIsValidTime() {
        assertTrue(myShop.isValidTime(12));
        assertTrue(myShop.isValidTime(23));
        assertFalse(myShop.isValidTime(6));
        assertFalse(myShop.isValidTime(24));
	}
    @Test
    void testGetMinAgeForAlcohol() {
        assertEquals(21, myShop.getMinAgeForAlcohol());
    }
    @Test
    void testFindOrder() {
        assertEquals(-1, myShop.findOrder(25));
    }
    @Test
    void testMonthlySale()
    {
    	 assertEquals(0, myShop.totalMonthlySale());
    }
    @Test
    void testProcessCoffeeOrder() {
        myShop.startNewOrder(12, Day.MONDAY, "John", 24);
        assertEquals(0, myShop.orders.get(0).getTotalItems());
        myShop.processCoffeeOrder("Latte", Size.SMALL, false, false);
        assertEquals(1, myShop.orders.get(0).getTotalItems());
        myShop.processCoffeeOrder("Espresso", Size.LARGE, true, false);
        assertEquals(2, myShop.orders.get(0).getTotalItems());
    }
    @Test
    void testProcessAlchoholOrder() {
        myShop.startNewOrder(12, Day.MONDAY, "Larry", 32);
        assertEquals(0, myShop.orders.get(0).getTotalItems());
        myShop.processAlcoholOrder("Beer", Size.SMALL);
        assertEquals(1, myShop.orders.get(0).getTotalItems());
        myShop.processAlcoholOrder("Wine", Size.LARGE);
        assertEquals(2, myShop.orders.get(0).getTotalItems());
    }
    @Test
    void testProcessSmoothieOrder() {
        myShop.startNewOrder(12, Day.MONDAY, "Larry", 32);
        assertEquals(0, myShop.orders.get(0).getTotalItems());
        myShop.processSmoothieOrder("Beer", Size.SMALL, 5, false);
        assertEquals(1, myShop.orders.get(0).getTotalItems());
        myShop.processSmoothieOrder("Wine", Size.LARGE, 10, true);
        assertEquals(2, myShop.orders.get(0).getTotalItems());
    }
  
}
