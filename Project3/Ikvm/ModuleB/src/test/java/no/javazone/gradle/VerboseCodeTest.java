package no.javazone.gradle;

import org.junit.Test;
import static org.junit.Assert.*;


public class VerboseCodeTest {

	@Test
	public void verify_that_constructor_sets_properties() {
		VerboseCode vc = new VerboseCode("name", "text");
		assertEquals("name", vc.getName());
		assertEquals("text", vc.getText());
	}
	
}