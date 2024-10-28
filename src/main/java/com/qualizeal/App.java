package com.qualizeal;
 
import com.qualizeal.javaapp08.operation.FactorialNumber;

public class App {
	public static void main(String[] args) {
		FactorialNumber factorialNumber = new FactorialNumber();
		int res = factorialNumber.generateFactorialNumber(4);
		System.out.println(res);
	 }
}
 