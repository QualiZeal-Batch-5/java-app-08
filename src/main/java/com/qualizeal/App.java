package com.qualizeal;

import com.qualizeal.javaapp08.operation.FactorialNumber;

public class App {
	public static void main(String[] args) {
		FactorialNumber factorialNumber = new FactorialNumber();
		System.out.println(factorialNumber.generateFactorialNumber(1));
		System.out.println(factorialNumber.generateFactorialNumber(-1));
		System.out.println(factorialNumber.generateFactorialNumber(0));
		
	}
}