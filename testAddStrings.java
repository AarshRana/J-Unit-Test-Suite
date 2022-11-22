package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting junitstring = new jUnitTesting();
		String result = junitstring.AddStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
