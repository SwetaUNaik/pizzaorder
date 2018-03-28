import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PizzaOrderTest {
	PizzaOrder p1;
	@Before
	public void setUp() throws Exception {
		p1=new PizzaOrder("chicken Pizza ",2,2000);
	}

	@Test
	public void testGetQuantity() {
		//fail("Not yet implemented");
		assertEquals(2,p1.getQuantity());
	}

	@Test
	public void testGetPrice() {
		//fail("Not yet implemented");
		assertEquals(2000,p1.getPrice());
	}

}
