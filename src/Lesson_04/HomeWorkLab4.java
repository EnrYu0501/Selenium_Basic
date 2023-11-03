package Lesson_04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class HomeWorkLab4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====MENU======");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Search for a number");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    for (int i = 0; i < num; i++) {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.printf("Array[%d]= ",i);
                        int addNum = scanner1.nextInt();
                        numbers.add(addNum);                    }
                    System.out.println("Number added to the list.");
                    break;
                case 2:
                    System.out.println("Numbers in the list: " + numbers);
                    break;
                case 3:
                    if (numbers.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        int max = Collections.max(numbers);
                        System.out.println("Maximum number: " + max);
                    }
                    break;
                case 4:
                    if (numbers.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        int min = Collections.min(numbers);
                        System.out.println("Minimum number: " + min);
                    }
                    break;
                case 5:
                    System.out.print("Enter the number to find: ");
                    int searchNumber = scanner.nextInt();
                    int index = numbers.indexOf(searchNumber);
                    if (index != -1) {
                        System.out.println("Number " + searchNumber + " found at Array[" + index + "] ");
                    } else {
                        System.out.println("Number not found in the list.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
