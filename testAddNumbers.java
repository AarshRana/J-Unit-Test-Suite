package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300,result);
	}
	
	
}
