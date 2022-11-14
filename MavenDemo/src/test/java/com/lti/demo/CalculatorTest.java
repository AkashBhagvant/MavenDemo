package com.lti.demo;

import java.util.ArrayList;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator c=new Calculator();
	
	//@Disabled 
   @Test
	public void testsayHello()
	{
		Assertions.assertEquals("hello",c.sayHello());
		
	}
   
   @Test
   public void testadd()
   {
	   Assertions.assertEquals(100,c.add(60,40),"Check the code again");
   }
   @Test
   void testAssertFalse()
   {
	   Assertions.assertFalse("meenal".length()==10);
       Assertions.assertFalse("meenal".length()==10);
       Assertions.assertNotEquals("Hello","hello");
       
   }
   @Test
   void testAssertNull()
   {
	   String str1=null;
	   String str2=null;
	   Assertions.assertNull(str2);
   }
   @Test
   public void testArrayList()
   {
	   ArrayList<Integer> myList=new ArrayList<Integer>();
	   Assertions.assertEquals(0,myList.size());
	   myList.add(100);
	   myList.add(120);
	   Assertions.assertEquals(2,myList.size());
	   
   }
   
}