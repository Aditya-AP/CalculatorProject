package org.bulldogs.calcWebApp;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addMethodTest1() 
	{
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		assertEquals(30, result);
	}

	@Test
	public void addMethodTest2() 
	{
		Calculator c = new Calculator();
		int result = c.add(-5, -20);
		assertEquals(-25, result);
	}	
	
	@Test
	public void addMethodTest3() 
	{
		Calculator c = new Calculator();
		int result = c.add(-5, 20);
		assertEquals(15, result);
	}		

	@Test
	public void subMethodTest1() 
	{
		Calculator c = new Calculator();
		int result = c.sub(20, 5);
		assertEquals(15, result);
	}

	@Test
	public void subMethodTest2() 
	{
		Calculator c = new Calculator();
		int result = c.sub(-20, 5);
		assertEquals(-25, result);
	}	
	
	@Test
	public void subMethodTest3() 
	{
		Calculator c = new Calculator();
		int result = c.sub(0, 0);
		assertEquals(0, result);
	}		
	

	@Test
	public void mulMethodTest1() 
	{
		Calculator c = new Calculator();
		int result = c.mul(5, 10);
		assertEquals(50, result);
	}		
	
	@Test
	public void mulMethodTest2() 
	{
		Calculator c = new Calculator();
		int result = c.mul(5, 0);
		assertEquals(0, result);
	}	
	
	@Test
	public void divMethodTest1() 
	{
		Calculator c = new Calculator();
		int result = c.div(5, 5);
		assertEquals(1, result);
	}	

	@Test
	public void divMethodTest2() 
	{
		Calculator c = new Calculator();
		int result = c.div(15, 5);
		assertEquals(3, result);
	}	

	@Test
	public void divMethodTest3() 
	{
		Calculator c = new Calculator();
		int result = c.div(15, 0);
		assertEquals(-1, result);
	}	
	
	@Test
	public void divMethodTest4() 
	{
		Calculator c = new Calculator();
		int result = c.div(15, 30);
		assertEquals(-1 , result);
	}
	
	@Test
	public void divMethodTest5() 
	{
		Calculator c = new Calculator();
		int result = c.div(0, 0);
		assertEquals(-1 , result);
	}
	
	@Test
	public void divMethodTest6() 
	{
		Calculator c = new Calculator();
		int result = c.div(0, 15);
		assertEquals(0, result);
	}	
	

}
