package Week10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		int actual = Calculator.add(4, 6);
		int expected = 10;
		assertEquals(expected, actual);
		
	}
	
	void testSubtraction() {
		int actual = Calculator.subtract(4, 6);
		int expected = -2;
		assertEquals(expected, actual);
	}

}
