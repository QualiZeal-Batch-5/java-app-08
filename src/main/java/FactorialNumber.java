
package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "A factorial function is a mathematical function that multiplies a given positive integer n by every positive integer less than n, down to 1";
	}
	
	public int generateFactorialNumber(int num) {
		if(num < 0) {
			return -1;
		}
		if(num == 0) {
			return -2;
		}
		int factorial = 1;
		while(num > 0) {
			factorial *= num;
			num--;
		}
		return factorial;
	}
}
