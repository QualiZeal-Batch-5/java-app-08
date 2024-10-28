package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "The factorial of a number is the multiplication of all the numbers between 1 and the number itself. ";
		
	}
	public int generateFactorialNumber(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return -2; 
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
