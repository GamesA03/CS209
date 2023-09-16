package Week10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayUtilTest {

	@Test
	void test() {
		int[] array = {1, 3, 5, 7, 9};
		int actual = ArrayUtil.findMax(array);
		int expected = 9;
		assertEquals(actual, expected);
		
	}
	
	void NegativeTest() {
		int[] array2 = {-1, -3, -5, -7, -9};
		int actual = ArrayUtil.findMax(array2);
		int expected = -1;
		assertEquals(actual, expected);
	}
	
	void EmptyTest() {
		int[] array3 = {};
		int actual = ArrayUtil.findMax(array3);
		int expected = -1;
		assertEquals(actual, expected);
		
	}

}
