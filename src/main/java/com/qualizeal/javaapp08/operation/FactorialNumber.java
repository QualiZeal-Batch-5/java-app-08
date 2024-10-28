package com.qualizeal.javaapp08.operation;
 
public class FactorialNumber {
	public String defineFactorialNumber() {
		return "Factorial Number";
	}
 
	public int generateFactorialNumber(int n) {
 
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return -2;
		} else {
			int result = 1;
			while (n != 1) {
				result = result * n;
				n = n - 1;
			}
			return result;
		}
 
	}
 
}