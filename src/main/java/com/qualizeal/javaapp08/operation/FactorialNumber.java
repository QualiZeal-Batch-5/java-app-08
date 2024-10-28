package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "The factorial of a whole number 'n' is defined as the product of that number with every whole number less than or equal to 'n' till 1.";
	}
	
	public int generateFactorialNumber(int num) {
		int result = 1;
		
		if(num < 0) {
			return -1;
		}
		else if(num == 0) {
			return -2;
		}
		else {
			for(int i = 1; i <= num; i++) {
				result = result * i;
			}
			return result;
		}
	}

}


