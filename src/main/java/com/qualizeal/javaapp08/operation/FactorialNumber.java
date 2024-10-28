package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return " Factorial of a number ‘n’ is defined as the product of all the whole numbers less than ‘n’ up to 1";
	}
	
	public int generateFactorialNumber(int num) {
		int result = 1;
		
		if(num < 0)
			return -1;
		else if(num == 0)
			return -2;
		else {
			for(int i = 1; i <= num; i++) {
				result = result * i;
			}
			return result;
		}
	}
}
