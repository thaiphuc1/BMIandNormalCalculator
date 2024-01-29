/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Library.CheckValid;
import Model.BMI;
import Model.Calculator;
import View.Menu;
/**
 *
 * @author thaip
 */
public class Execute extends Menu<String>{

    private static String[] mc = {"Normal calculator", "Calculator BMI index","Exit"};
    private BMI bmi = new BMI();
    private Calculator cal = new Calculator();
    public Execute() {
        super("========= Calculator Program =========",mc);
     }
    @Override
    public void execute(int n) {
        switch(n){
            case 1: normalCal();break;
            case 2: bmiCal();break;
            case 3: System.exit(0);
        }
    }
    
    public void bmiCal(){
        System.out.print("Enter Weight(kg): ");double weight = CheckValid.inputNum();
        System.out.print("Enter Height(cm): ");double height = CheckValid.inputNum();
        bmi.setWeight(weight);bmi.setHeight(height);
        
        System.out.println("BMI number : " + String.format("%.2f", bmi.numBMI()));
        bmi.statusBMI();
    }
    public void normalCal() {
        System.out.println("Enter number : ");double a = CheckValid.inputNum();
        System.out.println("Enter Operator : ");char op = CheckValid.inputOperator();
        while(op != '='){
            System.out.println("Enter number : ");double b = CheckValid.inputNum();
            cal = new Calculator(a, b);
            double memory = cal.execute(a, b, op);
            System.out.println("Memory : " + memory);
            a = memory;
            op = CheckValid.inputOperator();
        }
        System.out.println("Result : " + a);
    }

    
}
