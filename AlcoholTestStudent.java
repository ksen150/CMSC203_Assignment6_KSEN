import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
		Alcohol a1 = new Alcohol("Beer", Size.LARGE, true);
        Alcohol a2 = new Alcohol("Wine", Size.MEDIUM, false);
        assertTrue(a1.toString().contains("Beer"));
        assertTrue(a2.toString().contains("MEDIUM"));
	}
	@Test
	void testEquals() {
		Alcohol a1 = new Alcohol("Beer", Size.LARGE, false);
		Alcohol a2 = new Alcohol("Wine", Size.LARGE, false);
        assertFalse(a1.equals(a2));
	}
	@Test
	void testGetBevName() {
		Alcohol a1 = new Alcohol("Beer", Size.LARGE, false);
        assertEquals("Beer", a1.getBevName());
	}
	@Test
	void testIsWeekend() {
		Order one = new Order(5, Day.MONDAY, new Customer("Chris", 30));
		Order two = new Order(6, Day.SATURDAY, new Customer("Nancy", 40));
		assertFalse(one.isWeekend());
		assertTrue(two.isWeekend());
	}

}
