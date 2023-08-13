package Lesson_02;

public class OpenratorsLearning {
    public static void main(String[] args) {
        int myNum01 = 2;
        int myNum02 = 3;
        ++myNum02;
        int sum = ++myNum01 + myNum02++;
        // prefix Firt > right openrad > assign value to left openrad > postfix
        System.out.println("Total = " + sum);
    }
}
