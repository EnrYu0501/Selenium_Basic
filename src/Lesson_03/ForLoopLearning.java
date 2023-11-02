package Lesson_03;

import java.security.SecureRandom;
import java.util.Date;


public class ForLoopLearning {
    public static void main(String[] args) {
        int maxNumber = 18;
       int [] intArr = new int[maxNumber];

        for (int i = 0; i < maxNumber; i++) {
            int randomNum = new SecureRandom().nextInt(5);

            System.out.printf("phần tử mảng %d có giá trị %d\n",i ,randomNum);
        }
       

    }
}
