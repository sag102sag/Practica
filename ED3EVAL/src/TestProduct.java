import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProduct {

	@Test
	void testProduct() {
		Product producto1 = new Product("C1","Pan","Pan chachi",0.5);
		assertEquals("C1", producto1.getCode());
		assertEquals("Pan", producto1.getTitle());
		assertEquals("Pan chachi", producto1.getDescription());
		assertEquals(0.5, producto1.getPrice());
	}

}
