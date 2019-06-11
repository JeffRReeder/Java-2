import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaTest {

	
	//calculate rectangel area
	int recArea(int h, int w) {
		
		return  h*w;
	}
	
	@Test
	void test() {
		assertEquals(6, recArea(3,2));
		assertEquals(-25, recArea(-5,5));
	}

}
