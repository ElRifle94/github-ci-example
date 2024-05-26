package com.examples.myproject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class AppTest {
	private App app;
	
	@Before
	public void setup() {
		app = new App();
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Hello", app.sayHello());
	}
	
	@Test
	public void testSayHelloWithName() {
		assertEquals("Hello World", app.sayHello("World"));
	}
}
//public class AppTest 
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}


