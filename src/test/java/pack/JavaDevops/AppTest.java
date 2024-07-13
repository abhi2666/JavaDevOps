package pack.JavaDevops;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	Calculator c = new Calculator();
	
	public void testAdd() {
		assertEquals(10, c.add(5, 5));
	}
	
	public void testSub() {
		assertEquals(4, c.sub(10, 6));
	}
    
}
