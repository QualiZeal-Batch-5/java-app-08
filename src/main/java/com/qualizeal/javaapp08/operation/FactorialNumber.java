package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "A factorial is a function that multiplies a number by every number below it till 1";
	}

	public int generateFactorialNumber(int num) {

		if (num < 0) {
			return -1;
		} 
		else if (num == 0) {
			return -2;
		} 
		else {
			int result = 1;
			while (num != 1) {
				result = result * num;
				num = num - 1;
			}
			return result;
		}

	}
}
