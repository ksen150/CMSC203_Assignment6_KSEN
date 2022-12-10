import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetBevName() {
		Coffee c1 = new Coffee("Expresso", Size.LARGE, true, false);
        assertEquals("Expresso", c1.getBevName());
	}
	
	@Test
	void testToString() {
		Coffee c1 = new Coffee("Expresso", Size.LARGE, true, false);
		Coffee c2 = new Coffee("Expresso", Size.MEDIUM, false, false);
        assertTrue(c1.toString().contains("Expresso"));
        assertTrue(c2.toString().contains("MEDIUM"));
	}

	@Test
	void testEqualsObject() {
		Coffee c1 = new Coffee("Expresso", Size.LARGE, true, false);
		Coffee c2 = new Coffee("Expresso", Size.LARGE, true, false);
        assertFalse(c1.equals(c2));
	}

	@Test
	void testGetExtraShot() {
		Coffee c1 = new Coffee("Expresso", Size.LARGE, true, false);
        assertTrue(c1.getExtraShot());
	}

	@Test
	void testGetExtraSyrup() {
		Coffee c1 = new Coffee("Expresso", Size.LARGE, true, true);
        assertTrue(c1.getExtraSyrup());
	}
	@Test
	void testGetSize() {
		Coffee c1 = new Coffee("Expresso", Size.LARGE, true, false);
		assertEquals("LARGE", c1.getSize());
	}
}
