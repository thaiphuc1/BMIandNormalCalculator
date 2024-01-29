/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Library.CheckValid;

/**
 *
 * @author thaip
 */
public class BMI {
    private double weight;
    private double height;

    public BMI() {
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double numBMI(){
        double heightInMet = height / 100;
        double bmi = weight / Math.pow(heightInMet, 2);
        return bmi;
    }
    
    public void statusBMI(){
        if(numBMI() < 19){
            System.out.println("Under-standard");
        }
        else if(numBMI() >= 19 && numBMI() <= 25){
            System.out.println("Standard");
        }
        else if(numBMI() >= 25 && numBMI() <= 30){
            System.out.println("Overweight");
        }
        else if(numBMI() >= 30 && numBMI() <= 40){
            System.out.println("Fat - should lose weight");
        }
        else{
            System.out.println("Very fat - should lose weight immediately");
        }
    }
    
}
