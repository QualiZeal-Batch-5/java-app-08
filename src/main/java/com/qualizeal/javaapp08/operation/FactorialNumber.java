package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "Sum of all integers from 1 to the given number is known as factorial number";
	}
	public int generateFactorialNumber(int number) {
		
		int result = 1;
		
		if(number < 0) {
			return -1;
		}
		else if(number == 0) {
			return -2;
		}
		else {
			for(int i = 1; i <= number; i++) {
				result = result * i;
			}
			return result;
		}
	}
}

		
		

