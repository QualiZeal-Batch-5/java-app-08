package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "Factorial of a number is defined as the multiplication of all the number from one to the given number.";
	}
	public int generateFactorialNumber(int num)
	{
		if(num < 0)
			
			return -1;
		
		else if(num == 0)
			  
			return -2;
		else
		{   
			int sum = 1;
			
			for(int i = 1;i<= num;i++)
			{
				sum *= i;
			}
			return sum;
		}
			
	}

}
