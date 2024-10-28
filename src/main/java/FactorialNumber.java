package com.qualizeal.javaapp08.operation;

public class FactorialNumber {

   
    public String defineFactorialNumber() {
        return "The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.";
    }

    
    public int generateFactorialNumber(int num) {
        
       
        if (num < 0) {
            return -1;
        }
        
      
        if (num == 0) {
            return -2;
        }
        
       
        int factorial = 1;
        
      
        for (int i = 1; i <= num; i++) {
            factorial = factorial*i;
        }
        
        return factorial;
    }
}
