package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "A factorial is a function that multiplies a number by every number below it till 1";
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
