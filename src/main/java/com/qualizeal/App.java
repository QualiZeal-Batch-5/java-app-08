package com.qualizeal;

import com.qualizeal.javaapp08.operation.FactorialNumber;

public class App {
	public static void main(String[] args) {
		FactorialNumber factorialNumber = new FactorialNumber();
		System.out.println(factorialNumber.defineFactorialNumber());
		System.out.println(factorialNumber.generateFactorialNumber(12));

	}
}