import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class SizeTestStudent {

	Size s1 = Size.LARGE;
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSize() {
		assertTrue(s1.equals(Size.LARGE));
		assertFalse(s1.equals(Size.SMALL));
	}

}
