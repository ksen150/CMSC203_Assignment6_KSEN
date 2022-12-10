import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
		Customer c1 = new Customer("Erik", 19);
		Customer c2 = new Customer("Josh", 20);
        assertTrue(c1.toString().contains("Erik"));
        assertEquals(20, c2.getAge());
	}
	@Test
	void testGetName() {
		Customer c1 = new Customer("Erik", 19);
        assertEquals("Erik", c1.getName());
	}
	@Test
	void testGetAge() {
		Customer c1 = new Customer("Erik", 19);
        assertEquals(19, c1.getAge());
	}

}
