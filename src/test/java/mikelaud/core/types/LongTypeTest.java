package mikelaud.core.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LongTypeTest {

	@Test
	public void testNvl() {
		assertNotNull(LongType.nvl(null));
		assertEquals(LongType.nvl(null), LongType.ZERO_OBJECT);
		//
		assertNotNull(LongType.nvl(LongType.ZERO_OBJECT));
		assertEquals(LongType.nvl(LongType.ZERO_OBJECT), LongType.ZERO_OBJECT);
		//
		assertNotNull(LongType.nvl(Long.MAX_VALUE));
		assertEquals(LongType.nvl(Long.MAX_VALUE), Long.valueOf(Long.MAX_VALUE));
	}

}
