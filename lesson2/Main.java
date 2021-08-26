package ru.geekbrains.lesson2;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        change0on1And1on0InArray();
        createArrayNumericProgression();
        multiplicationBy2NumberLess6();
        hasArrayOfOnes();

        int[] oneDimensionalArray = {1, 20, 4, 5, 4, 1, 4, -2, 1, 4};
        crateArrayOfMaximumAndMinimum(oneDimensionalArray);

        System.out.println("Есть ли в масиве место в котором сумма левой и правой части равны? - " + hasResultTrueOrFalse(oneDimensionalArray));
    }

        public static void change0on1And1on0InArray(){
        int[] array0And1 = {0, 1, 0, 1, 0, 0, 0, 1};
        for (int i = 0; i < array0And1.length; i++) {
            if (array0And1[i] == 0) {
                array0And1[i] = 1;
            }
            else {
                array0And1[i] = 0;
            }
            System.out.print(array0And1[i] + " ");
        }
        System.out.println();
    }

    public static void createArrayNumericProgression() {
        int[] arrayNumericProgression = new int[8];
        for (int i = 0; i < arrayNumericProgression.length; i++) {
            arrayNumericProgression[i] = i * 3;
            System.out.print(arrayNumericProgression[i] + " ");
        }
        System.out.println();
    }

    public  static void multiplicationBy2NumberLess6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void hasArrayOfOnes() {
        int arrayHeight = 10;
        int arrayWidth = 10;
        int[][] array = new int[arrayHeight][arrayWidth];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; ) {
                array[i][j] = 1;
                array[i][array[i].length - j - 1] = 1;
                j++;
                System.out.println(Arrays.toString(array[i]));
                break;
            }
        }


    }

    public static void crateArrayOfMaximumAndMinimum(int[] array) {
        int minValue, maxValue;
        minValue = maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (minValue > array[j]) {
                    minValue = array[j];
                }
                if (maxValue < array[j]) {
                    maxValue = array[j];
                }

            }
        }
        System.out.println("Массив = " + Arrays.toString(array));
        System.out.println("Максимальное знчение = " + maxValue + "\n" + "Минимальное значение = " + minValue);
    }

    public static boolean hasResultTrueOrFalse(int[] array) {
        int sumLeftSideNumber = 0;
        int sumRightSideNumber;
        for (int i = 0; i < array.length; i++) {
            sumLeftSideNumber += array[i];
            sumRightSideNumber = 0;
            for (int j = i + 1; j < array.length; j++) {
                sumRightSideNumber += array[j];
            }
            if (sumLeftSideNumber == sumRightSideNumber) {
                return true;
            }
        }
        return false;
    }

}