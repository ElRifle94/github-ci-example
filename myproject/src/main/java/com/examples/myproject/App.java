package com.examples.myproject;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
    
    public String sayHello() {
    	return sayHello(null);
    }
    
    public String sayHello(String name) {
    	if (name == null)
    		return "Hello";
    	else
    		return "Hello" + name;
    }
}
