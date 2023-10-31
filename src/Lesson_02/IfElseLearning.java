package Lesson_02;

import java.util.Scanner;

public class IfElseLearning {
    public static void main(String[] args) {
        float height,weight, BMI;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Height(m): ");
        height = scanner.nextFloat();
        System.out.print("Input Weight(Kg): ");
        weight = scanner.nextFloat();
        BMI = weight / (height * 2);
        if(BMI <= 18.5){
            System.out.println("BMI: " + BMI + " \nYou Are Underweight!!!");
        } else if (BMI <= 24.9) {
            System.out.println("BMI: " + BMI + " \nYou Are Normal Weight!!!");
        } else if (BMI <= 29.9) {
            System.out.println("BMI: " + BMI + " \nYou Are Over Weight!!!");
        } else {
            System.out.println("BMI: " + BMI + " \nYou Are Obesity!!!");
        }

    }
}
