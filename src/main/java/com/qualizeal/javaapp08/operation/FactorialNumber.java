package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	public String defineFactorialNumber() {
		return "FactorialNumber :It is a multiplication of all numbers between 1 and n.";
	}
	
	public int generateFactorialNumber(int number) {
		if(number < 0) {
			return -1;
		}
		else if(number == 0) {
			return -2;
		}
		else {
			int result = 1;
			for(int i=1;i<=number;i++) {
				result = result * i;
			}
			return result;
		}
		
	}
}