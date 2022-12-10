import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {
	Order orderOne, orderTwo, orderThree, orderFour;

	@BeforeEach
	void setUp() throws Exception {
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		orderTwo = new Order(12, Day.SATURDAY, new Customer("John", 45));
		orderThree = new Order(10, Day.SUNDAY, new Customer("Kate", 21));
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testCalcOrderTotal() {
		orderOne.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		orderOne.addNewBeverage("Mohito", Size.SMALL);
		orderOne.addNewBeverage("Detox", Size.MEDIUM, 1, false);

		assertEquals(7.5, orderOne.calcOrderTotal(), .01);

		orderTwo.addNewBeverage("regular Coffee", Size.MEDIUM, true, false);
		orderTwo.addNewBeverage("Mohito", Size.SMALL);
		orderTwo.addNewBeverage("Detox", Size.MEDIUM, 4, true);

		assertEquals(12.6, orderTwo.calcOrderTotal(), .01);

	}
	@Test
	public void testAddNewBeverage() throws NullPointerException {

		assertTrue(orderOne.getTotalItems() == 0);
		orderOne.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		assertTrue(orderOne.getBeverage(0).getType().equals(Type.COFFEE));
		orderOne.addNewBeverage("Mohito", Size.SMALL);
		assertTrue(orderOne.getBeverage(1).getType().equals(Type.ALCOHOL));
		orderOne.addNewBeverage("Detox", Size.MEDIUM, 1, false);
		assertTrue(orderOne.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(orderOne.getTotalItems() == 3);

		orderTwo.addNewBeverage("Detox", Size.MEDIUM, 4, true);
		assertTrue(orderTwo.getBeverage(0).getType().equals(Type.SMOOTHIE));
		orderTwo.addNewBeverage("Mohito", Size.SMALL);
		assertTrue(orderTwo.getBeverage(1).getType().equals(Type.ALCOHOL));
		orderTwo.addNewBeverage("regular Coffee", Size.MEDIUM, true, false);
		assertTrue(orderTwo.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(orderTwo.getTotalItems() == 3);
	}
	@Test
	void testToString() {
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
        assertTrue(orderOne.toString().contains("Mary"));
	}
	@Test
	void testIsWeekend() {
		Order one = new Order(5, Day.MONDAY, new Customer("Chris", 30));
		Order two = new Order(6, Day.SATURDAY, new Customer("Nancy", 40));
		assertFalse(one.isWeekend());
		assertTrue(two.isWeekend());
	}
	@Test
	void testGetOrderTime() {
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		assertEquals(8, orderOne.getOrderTime());
	}
	@Test
	void testFindNumOfBeveType() {
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		orderOne.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		assertEquals(1, orderOne.findNumOfBeveType(Type.COFFEE));
	}
	@Test
	void testCompareTo() {
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		orderOne.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		assertEquals(0, orderOne.compareTo(orderOne));
	}
	@Test
	void testGetTotalItems() {
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		orderOne.addNewBeverage("regular Coffee", Size.SMALL, false, false);
		assertEquals(1, orderOne.getTotalItems());
	}
	@Test
	void testGetCustomer() {
		//Order one = new Order(5, Day.MONDAY, new Customer("Chris", 30));
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		assertEquals("Mary, 22 years old", orderOne.getCustomer());
	}
	@Test
	void testGetOrdayDay() {
		orderOne = new Order(8, Day.MONDAY, new Customer("Mary", 22));
		assertEquals("MONDAY", orderOne.getOrderDay());
	}
}
