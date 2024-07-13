package pack.JavaDevops;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int result = 0;
    public static void main( String[] args )
    {
    	System.out.println("Starting the project....");
    	Calculator c = new Calculator();
    	result = c.add(5,  5);
    	System.out.println("Addition : " + result);
    	result = c.sub(10, 6);
    	System.out.println("Subtraction : " + result);
    	
    }
}

