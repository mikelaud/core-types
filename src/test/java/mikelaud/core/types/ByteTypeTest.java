package mikelaud.core.types;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ByteTypeTest {

	@Test
	public void testNvl() {
		assertNotNull(ByteType.nvl(null));
		assertEquals(ByteType.nvl(null), ByteType.ZERO_OBJECT);
		//
		assertNotNull(ByteType.nvl(ByteType.ZERO_OBJECT));
		assertEquals(ByteType.nvl(ByteType.ZERO_OBJECT), ByteType.ZERO_OBJECT);
		//
		assertNotNull(ByteType.nvl(Byte.MAX_VALUE));
		assertEquals(ByteType.nvl(Byte.MAX_VALUE), Byte.valueOf(Byte.MAX_VALUE));
	}

}
