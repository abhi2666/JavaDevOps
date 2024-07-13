package pack.JavaDevops;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	// follow naming convention when creating a test function 
	/*
	 * addTest - not valid name
	 * TestAdd - not valid name
	 * testAdd - Valid name
	 */
		Calculator c = new Calculator();
		
		public void testAdd() {
			assertEquals(10, c.add(5, 5));
		}
	
}
