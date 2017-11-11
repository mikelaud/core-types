package mikelaud.core.types;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FxStyleTest {

	@Test
	public void test() {
		assertNotNull(FxStyle.READ_ONLY);
		assertTrue(FxStyle.READ_ONLY.length() > 0);
	}

}
