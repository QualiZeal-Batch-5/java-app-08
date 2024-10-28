package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	
	public String defineFactorialNumber() {
		
		return "Factorial is a function that multiplies a number by every number below it till 1.";
	}
	
	public int generateFactorialNumber(int number) {
		
		if (number < 0) 
		{
            return -1;
        } 
		else if (number == 0) 
		{
            return -2;
        }
		else {
        	int factorial = 1;
        	
        	for (int i = 1; i <= number; i++) 
        	{
        		factorial *= i;

        		if (factorial < 0) 
        		{
        			return -1;
        		}
        	}
        	return factorial;
        }
	}
}