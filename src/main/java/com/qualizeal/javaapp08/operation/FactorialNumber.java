package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "The factorial of a whole number 'n' is defined as the product of that number with every whole number less than or equal to 'n' till 1.";
	}
	
	public int generateFactorialNumber(int num1) {

		if (num1 < 0) {
			return -1;
		} else if (num1 == 0) {
			return -2;
		} else {
			int result = 1;
			while (num1 != 1) {
				result = result * num1;
				num1 = num1 - 1;
			}
			return result;
		}

	}

}
