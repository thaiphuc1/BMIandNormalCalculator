/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import View.Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author thaip
 */
public class CheckValid {
    
    public static double inputNum() {
        Scanner sc = new Scanner(System.in);
         while (true) {
            try {
                double a = sc.nextDouble();
                
                return a;
               
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("BMI is digit");
               
               sc = new Scanner(System.in);
                System.out.println("Please input valid number.");
            }
        }
         
    }
    public static char inputOperator() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter operator (+, -, *, /, ^): ");
            String input = sc.nextLine();
        if (input.length() == 1 && "+-*/^=".indexOf(input.charAt(0)) != -1) {
            return input.charAt(0);
        } else {
            System.out.println("Invalid operator. ");
            }
        }
    }

}
