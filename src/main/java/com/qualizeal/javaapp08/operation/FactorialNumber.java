package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	
	public String defineFactorialNumber() {
	        return "A factorial of a non-negative integer n is the product of all positive integers less than or equal to n.";
	    }

	    public int generateFactorialNumber(int number) {
	        if (number < 0) {
	            return -1; 
	        }
	        if (number == 0) {
	            return -2;  
	        }

	        long factorial = 1; 
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	            if (factorial > Integer.MAX_VALUE) {
	                return -1; 
	            }
	        }
	        return (int) factorial; 
	    }

}
