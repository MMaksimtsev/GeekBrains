package lesson9;

import java.util.Arrays;

public class Lesson9 {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.toString(i + j);
            }
        }
        array[3][0] = "3";
        array[3][1] = "-";
        array[3][2] = "5";
        array[3][3] = "6";
        System.out.println(Arrays.deepToString(array));


        try {
            convertArray(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


    }

    public static void convertArray (String[][] array) throws MyArraySizeException, MyArrayDataException{
        int currentSum = 0;
        if (array.length != 4 || array[3].length != 4) {
            throw new MyArraySizeException("Размер двумерного массива не является 4/4");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    currentSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В " + (i + 1) + " строке " + (j + 1) + " столбце символ не является числом.");
                }
            }
        }
        System.out.println("Сумма чисел всех элементов массива = " + currentSum);
    }
}
