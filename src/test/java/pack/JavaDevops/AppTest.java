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
	
	public void add () {
		Calculator c = new Calculator();
		int res = c.add(5, 5);
		assertEquals(10, res);
		res = c.sub(10, 6);
		assertEquals(4, res);
	}
    
}
