package mikelaud.core.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringTypeTest {

	@Test
	public void testEmpty() {
		assertNotNull(StringType.empty());
		assertTrue(StringType.empty().isEmpty());
	}

	@Test
	public void testNvl() {
		assertNotNull(StringType.nvl(null));
		assertTrue(StringType.nvl(null).isEmpty());
		//
		assertNotNull(StringType.nvl(""));
		assertTrue(StringType.nvl("").isEmpty());
		//
		assertNotNull(StringType.nvl("qwerty"));
		assertEquals("qwerty", StringType.nvl("qwerty"));
	}

}
