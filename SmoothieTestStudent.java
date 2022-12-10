import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
		Smoothie s1 = new Smoothie("Banana", Size.LARGE, 1, false);
		Smoothie s2 = new Smoothie("Strawberry", Size.MEDIUM, 2, false);
        assertTrue(s1.toString().contains("Banana"));
        assertTrue(s2.toString().contains("MEDIUM"));
	}
	@Test
	void testGetBevName() {
		Smoothie s1 = new Smoothie("Strawberry", Size.LARGE, 1, false);
        assertEquals("Strawberry", s1.getBevName());
	}
	@Test
	void testGetAddProtein() {
		Smoothie s1 = new Smoothie("Strawberry", Size.LARGE, 1, true);
        assertEquals(true, s1.getAddProtein());
	}
	@Test
	void testGetANumOfFruits() {
		Smoothie s1 = new Smoothie("Strawberry", Size.LARGE, 1, true);
        assertEquals(1, s1.getNumOfFruits());
	}
	@Test
	void testEquals() {
		Smoothie s1 = new Smoothie("Banana", Size.LARGE, 2, false);
		Smoothie s2 = new Smoothie("Strawberry", Size.LARGE, 2, false);
        assertFalse(s1.equals(s2));
	}

}
