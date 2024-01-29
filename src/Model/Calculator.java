/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thaip
 */
public class Calculator {
    private double a;
    private double b;

    public Calculator() {
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    
    
    public double execute(double a, double b, char op){
        
        while(true){
            switch (op) {
                case '+':
                    return a + b;
                case '-':
                    return a - b;
                case '*':
                    return a * b;
                case '/':
                    if(b != 0){
                        return a / b;
                    }else{
                        System.out.println("B can not equals zero.");
                    }
                case '^':
                    return Math.pow(a, b);
            }
            
        }
        
    }
    
     
     
    
}
