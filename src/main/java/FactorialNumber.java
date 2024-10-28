package com.qualizeal.javaapp08.operation;

public class FactorialNumber {
	
	public String defineFactorialNumber() {
		return "Factorial of a number is the product of all positive integers less than or equal to that number.";
	}
	
	public int generateFactorialNumber (int num){
		if(num < 0) return -1;
		
		else if(num == 0) return -2;
		
		else{
			int factorial = 1;
			
			for(int i = 1; i <= num; i++){
				factorial *= i;
			}
			
			return factorial;
		}
	}
}