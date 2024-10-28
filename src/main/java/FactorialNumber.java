package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "Factorial number";
	}

	public int generateFactorialNumber(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return -2;
		} else {
			int i, fact = 1;
			for (i = 1; i <= n; i++) {
				fact = fact * i;
			}
			return fact;
		}

	}
}
