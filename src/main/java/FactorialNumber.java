package com.qualizeal.javaapp08.operation;

public class FactorialNumber{
	public String defineFactorialNumber(){
		return "A factorial number, denoted as n!, is the product of all positive integers from 1 to n.";
	}
	
	public int generateFactorialNumber(int num1){
		
		if(num1 < 0){
			return -1;
		}
		
		else if(num1 == 0){
			return -2;
		}
		
		else{
			int result = 1;
            for (int i = 1; i <= num1; i++){
				result *= i;
			}
		    return result;
		}
		
	}
}