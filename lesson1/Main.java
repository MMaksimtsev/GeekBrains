package ru.geekbrains.lesson1;

import java.util.Scanner;

public class Main {
    private static final int MIN_VALUE = 0;
    private static final int MAX_Value= 20;
    public static void main(String[] args) {
        byte valueByte = 100;
        short valueShort = -200;
        int valueInt = 200;
        long valueLong = 10L;
        float valueFloat = 12.22f;
        double valueDouble = -212;
        char valueChar = 'A';
        boolean valueBoolean = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Значение в пременной ValueByte = " + valueByte + "\n" +
                "Значение в пременной valueShort = " + valueShort + "\n"+
                "Значение в пременной valueInt = " + valueInt + "\n"+
                "Значение в пременной valueLong = " + valueLong + "\n"+
                "Значение в пременной valueFloat = " + valueFloat + "\n"+
                "Значение в пременной valueDouble = " + valueDouble + "\n"+
                "Значение в пременной valueChar = " + valueChar + "\n"+
                "Значение в пременной valueBoolean = " + valueBoolean + "\n");

        System.out.println("Результар выражения  a*(b + (c/d))= " + getResult(2.0f, 3.0f, 4.0f, 5.0f) + "\n");
        System.out.println("Числов находится в пределах от 10 до 20? - " +  getSumFrom10To20(2, 12) + "\n");
        System.out.print("Введите целое число, для определения является число положительным или отрицательным: ");
        int numberInt = scanner.nextInt();
        System.out.println(getPositiveOrNegativeNumber(numberInt) + "\n");

        System.out.print("Введите целое число, если число положительнное выведется false, если отрицательное - true: ");
        int numberIntTrueOfFalse = scanner.nextInt();
        System.out.println(getTrueOrFalse(numberIntTrueOfFalse) + "\n");

        System.out.print("Введите ваше имя: ");
        scanner.nextLine();
        String userName = scanner.nextLine();
        getUserName(userName);

        System.out.print("Введите год");
        int valueLeapYear = scanner.nextInt();
        getLeapYear(valueLeapYear);

    }

    public static float getResult(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean getSumFrom10To20(int a, int b) {
        int sum = a + b;
        boolean result;
        result = (sum >= MIN_VALUE) && (sum <= MAX_Value);
        return result;
    }
    public static String getPositiveOrNegativeNumber(int a) {
        String s;
        if (a >= 0) {
            s = a + " является положительным числом";
        } else {
            s = a + " является отрицательным числом";
        }
        return s;
    }

    public static boolean getTrueOrFalse(int a){
        return !(a >= 0);
    }
    public static void getUserName(String a){
        System.out.println("Привет, " + a);
    }

    public  static void getLeapYear(int a){
        if (a % 4 == 0) {
            if (a % 400 == 0) {
                System.out.println(a + "Год високосный");
            } else if (a % 100 == 0) {
                System.out.println(a + "Год невисокосный");
            } else {
                System.out.println(a + "Год високосный");
            }
        }
        else System.out.println(a + "Год невисокосный");

    }
}
