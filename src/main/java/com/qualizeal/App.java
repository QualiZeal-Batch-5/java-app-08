package com.qualizeal;

import com.qualizeal.javaapp08.operation.FactorialNumber;

public class App {
	public static void main(String[] args) {
		FactorialNumber factorialNumber = new FactorialNumber();
		int result = factorialNumber.generateFactorialNumber(7);
		
		System.out.println(factorialNumber.defineFactorialNumber());
		System.out.println(result);		
	}
}