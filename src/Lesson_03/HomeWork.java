package Lesson_03;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class HomeWork {
    public static void main(String[] args) {
    Lab3_1();
    Lab3_2();
    Lab3_3();
    Lab3_4();

    }
    public static void Lab3_1(){
        int[] inArr = {1, 2, 3, 4, 5};
        int Even_numders = 0;
        int Old_numbers = 0;

        // Enhanced for loop
        for (int i : inArr) {
            if (i % 2 == 0) {
                Even_numders++;
            } else {
                Old_numbers++;
            }
        }
        System.out.println("Even numbers: " + Even_numders);
        System.out.println("Old numbers: " + Old_numbers);
    }
    public  static void Lab3_2(){
        int[] inArr = {3, 1, 2, 4, 5};
        int Max = inArr[0];
        int Min = inArr[0];
        for (int num : inArr) {
            if(num > Max) {
                Max = num;
            }else if(num < Min) {
                Min = num;
            }
        }
        System.out.println("Maximun: " + Max);
        System.out.println("Minimun: " + Min);
    }
    public static void Lab3_3(){
        int [] inArr= {12, 34, 1, 16, 28};
        selectionSort(inArr);
        System.out.println("Sort array min to max: " + Arrays.toString(inArr));

    }
    public  static void Lab3_4(){
        int [] intArr_01 = {1, 12, 16, 28, 34};
        int [] intArr_02 = {1, 13, 16, 27, 99};
        int[] mergedArray = mergeArrays(intArr_01, intArr_02);
        selectionSort(mergedArray);
        int [] uniqueArr =  removeDuplicates(mergedArray);

        System.out.println("Array 1: " + Arrays.toString(intArr_01));
        System.out.println("Array 2: " + Arrays.toString(intArr_02));
        System.out.println("Merge Array: " + Arrays.toString(uniqueArr));

    }
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();  // LinkedHashSet to preserve order
        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index] = num;
            index++;
        }

        return uniqueArray;
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        return merged;
    }

}