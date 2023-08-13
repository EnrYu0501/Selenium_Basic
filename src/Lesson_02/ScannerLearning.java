package Lesson_02;

import java.util.Scanner;

public class ScannerLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số bât kì: ");
        int inputNum = scanner.nextInt();
        //System.out.println("Số bạn đã nhập: " + inputNum);
        //System.out.printf("Số bạn đã nhập: %d\n",inputNum);
        if(inputNum % 2 == 0){
            System.out.println(inputNum + " là số chẵn");
        }else{
            System.out.println(inputNum + " là số lẽ");
        }

    }
}
