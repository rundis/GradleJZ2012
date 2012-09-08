package no.javazone.gradle

import org.junit.Test
import static org.junit.Assert.*


class SaneCode2Test {

	@Test
	void verify_that_constructor_sets_properties() {
		def vc = new SaneCode2(name: "name", text: "text")
		assertEquals("name", vc.name);
		assertEquals("text", vc.text);
	}
	
}