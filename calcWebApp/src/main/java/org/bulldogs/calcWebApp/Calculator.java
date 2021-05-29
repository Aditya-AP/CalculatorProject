package org.bulldogs.calcWebApp;

public class Calculator 
{
	public int sub(int a, int b)
	{
		return a-b;
	}
		
	public int add(int a, int b)
	{
		
		return a+b;
	}
		
	public int mul(int a, int b)
	{
		return a*b;
	}	
	
	public int div(int a, int b)
	{
		if (b==0)
			return -1;
		else if (a==0)
			return 0;
		else if (a<b)
			return -1;
		else if (a==0 && b==0)
			return -1;
		
			
		return a/b;
	}
	
	
	
	
}
