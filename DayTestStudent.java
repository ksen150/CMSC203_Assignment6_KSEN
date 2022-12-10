import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DayTestStudent {

	Day d1 = Day.FRIDAY;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDay() {
		assertTrue(d1.equals(Day.FRIDAY));
		assertFalse(d1.equals(Day.SATURDAY));
	}

}
