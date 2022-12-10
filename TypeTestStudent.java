import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TypeTestStudent {

	Type t1 = Type.SMOOTHIE;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testType() {
		assertTrue(t1.equals(Type.SMOOTHIE));
		assertFalse(t1.equals(Type.COFFEE));
	}

}
