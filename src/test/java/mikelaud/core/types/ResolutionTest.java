package mikelaud.core.types;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ResolutionTest {

	private Resolution mResolution = null;
	
	@Before
	public void before() {
		mResolution = Resolution.HD_720;
	}
	
	@Test
	public void testConstructor() {
		assertNotNull(mResolution);
	}

	@Test
	public void testWidth() {
		assertTrue(mResolution.getWidth() > 0);
	}

	@Test
	public void testHeight() {
		assertTrue(mResolution.getHeight() > 0);
	}

	@Test
	public void testToString() {
		assertNotNull(mResolution.toString());
		assertTrue(mResolution.toString().length() > 0);
	}

}
