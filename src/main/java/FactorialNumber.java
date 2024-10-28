package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	
	public String defineFactorialNumber() {
		
		return "defineFactorialNumber";
		
	}
	
	public long generateFactorialNumber(int num) {
		
		if (num < 0) {
			
			return -1;
			
		}
		
		if (num == 0) {
			
			return -2;
			
		}
		
		long result = 1;
		
		for ( int i = 1 ; i <= num ; i++) {
			
			result *= i;
		}
		return result;
		
	}
	
}
