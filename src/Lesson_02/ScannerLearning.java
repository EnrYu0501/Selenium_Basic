package Lesson_02;

import java.util.Scanner;

public class ScannerLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số bât kì: ");
        int input_Num = scanner.nextInt();
        //System.out.println("Số bạn đã nhập: " + input_Num);
        //System.out.printf("Số bạn đã nhập: %d\n",input_Num);
        if(input_Num % 2 == 0){
            System.out.println(input_Num + " là số chẵn");
        }else{
            System.out.println(input_Num + " là số lẽ");
        }

    }
}
