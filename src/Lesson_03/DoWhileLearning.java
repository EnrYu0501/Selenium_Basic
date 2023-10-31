package Lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLearning {
    public static void main(String[] args) {

        int guesingTime = 0;
        int randomNum = new SecureRandom().nextInt(5);

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please Input One Number: ");
            int inputNum = scanner.nextInt();

            if(inputNum == randomNum){
                System.out.println("Hooray!!! You Guessed Right");
                break;
            }
            guesingTime ++;
        }while (guesingTime < 3);
        System.out.println("Wish you luck next time");
    }
}
