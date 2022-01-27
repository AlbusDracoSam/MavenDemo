package com.sam.MavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext con = new ClassPathXmlApplicationContext("Spring.xml");
    	
    	Vehicle obj = (Vehicle) con.getBean("bike");
    	
    	obj.drive();
    	
    	    	
    }
}
