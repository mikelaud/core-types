package mikelaud.core.types;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.function.Consumer;

import org.junit.Test;

public class ResolutionTest {

	private void iterate(Consumer<Resolution> aStatement) {
		for (Resolution resolution : Resolution.values()) {
			aStatement.accept(resolution);
		}
	}
	
	@Test
	public void testConstructor() {
		iterate(resolution -> assertNotNull(resolution));
	}

	@Test
	public void testWidth() {
		iterate(resolution -> assertTrue(resolution.getWidth() > 0));
	}

	@Test
	public void testHeight() {
		iterate(resolution -> assertTrue(resolution.getHeight() > 0));
	}

	@Test
	public void testToString() {
		iterate(resolution -> {
			assertNotNull(resolution.toString());
			assertTrue(resolution.toString().length() > 0);			
		});
	}

}
