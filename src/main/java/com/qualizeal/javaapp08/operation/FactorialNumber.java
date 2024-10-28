package com.qualizeal.javaapp08.operation;

public class FactorialNumber {

	public String defineFactorialNumber() {
		return "The factorial of any natural number “n” is defined as the product of all natural numbers till n.";
	}
	
	public String generateFactorialNumber(int number) {
		if(number < 0) {
			return "-1";
		}
		else if(number == 0) {
			return "-2";
		}
		else if(number == 1){
			return "1";
		}
		else {
			int a = 1;
			while(number > 0) {
				a = a * number;
				number = number-1;
			}
			return "a";
		}
	}
}
