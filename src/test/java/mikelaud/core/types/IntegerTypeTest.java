package mikelaud.core.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class IntegerTypeTest {

	@Test
	public void testNvl() {
		assertNotNull(IntegerType.nvl(null));
		assertEquals(IntegerType.nvl(null), IntegerType.ZERO_OBJECT);
		//
		assertNotNull(IntegerType.nvl(IntegerType.ZERO_OBJECT));
		assertEquals(IntegerType.nvl(IntegerType.ZERO_OBJECT), IntegerType.ZERO_OBJECT);
		//
		assertNotNull(IntegerType.nvl(Integer.MAX_VALUE));
		assertEquals(IntegerType.nvl(Integer.MAX_VALUE), Integer.valueOf(Integer.MAX_VALUE));
	}

}
