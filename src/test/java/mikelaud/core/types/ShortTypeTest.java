package mikelaud.core.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ShortTypeTest {

	@Test
	public void testNvl() {
		assertNotNull(ShortType.nvl(null));
		assertEquals(ShortType.nvl(null), ShortType.ZERO_OBJECT);
		//
		assertNotNull(ShortType.nvl(ShortType.ZERO_OBJECT));
		assertEquals(ShortType.nvl(ShortType.ZERO_OBJECT), ShortType.ZERO_OBJECT);
		//
		assertNotNull(ShortType.nvl(Short.MAX_VALUE));
		assertEquals(ShortType.nvl(Short.MAX_VALUE), Short.valueOf(Short.MAX_VALUE));
	}

}
