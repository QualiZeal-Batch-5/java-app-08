package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber () {
		return "The factorial of a number is the multiplication of all the numbers between 1 and the number itself.";
	}
	
	public int generateFactorialNumber(int num) {
		if(num < 0) {
			return -1;
		}
		
		else if(num == 0) {
			return -2;
		}
		else {
			int fact = 1;
			for(int i = 1;i <= num;i++) {
				fact = fact * i;
			}
			return fact;
		}
	}
}