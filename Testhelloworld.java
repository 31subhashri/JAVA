
import static org.junit.Assert.*;
import org.junit.Test;

class Testhelloworld {
	
	
	@Test
	public void testResult() {
		helloworld ob = new helloworld();
		String output = ob.Result();
		assertEquals("Hello, World",output);
	}

}
