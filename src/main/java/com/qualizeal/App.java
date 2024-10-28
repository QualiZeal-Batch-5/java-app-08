package com.qualizeal;

import com.qualizeal.javaapp08.operation.FactorialNumber;

public class App {
	public static void main(String[] args) {
		FactorialNumber factorialNumber = new FactorialNumber();
		int result = factorialNumber.generateFactorialNumber(5);
		System.out.println(result);
	}
}