import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringlowertest {
	
	//convert string to lower case
	public String toLower(String s) {
	return s.toLowerCase();
	}

	@Test
	void test() {
		assertEquals("abcd", toLower("ABcD"));
		assertEquals("cat", toLower("Dog"));
		assertNotNull(toLower("cat"));
	}

}
