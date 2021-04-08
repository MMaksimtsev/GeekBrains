package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static final int COUNT_WORDS = 25;
    static final int MAX_WORD_LENGTH = 15;

    public static void main(String[] args) {

        letsPlayInTheGame();

        String[] words = new String[]{"aapple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        getUserAnswer(words);

    }

    public static void letsPlayInTheGame() {
        Random random = new Random();
        Scanner console = new Scanner(System.in);
        int inputNumber;
        int exitGame;
        do {
            int randomNumber = random.nextInt(10);
            int attemptCount = 0;
            do {
                System.out.println("Введите число от 0 до 9");
                inputNumber = console.nextInt();
                if (inputNumber > randomNumber) {
                    System.out.println("Введенное вами число больше случайного");
                }
                else if (inputNumber < randomNumber){
                    System.out.println("Введенное вами число меньше случайного");
                }
                else {
                    System.out.println("!!!Вы молодец, отгадали число!!!");
                    break;
                }
                attemptCount++;
            } while (attemptCount < 3);
            if (inputNumber != randomNumber) {
                System.out.println();
                System.out.println("!!!Вы проиграли!!!");
            }
            System.out.println("Хотите продолжить игру? -  введите 1 для продолжения и 0 для завершения");
            exitGame = console.nextInt();
        } while (exitGame == 1);
    }

    private static void getUserAnswer(String[] arrayOfWords){
        Random random = new Random();
        String question = arrayOfWords[random.nextInt(COUNT_WORDS)];
        Scanner console = new Scanner(System.in);
        String answer;
        int wordLength;
        boolean exitGame = true;
        do {
            System.out.println("Введите слово");
            answer = console.nextLine();
            if (answer.equals(question)) {
                System.out.println("Вы отгадали слво");
                exitGame = false;
            }
            else {
                wordLength = (answer.length() > question.length()) ? question.length() : answer.length();
                for (int i = 0; i < wordLength; i++) {
                    if (answer.charAt(i) == question.charAt(i)) {
                        System.out.print(answer.charAt(i));
                    }
                    else {
                        System.out.print("#");
                    }
                }
                while (wordLength < MAX_WORD_LENGTH) {
                    System.out.print("#");
                    wordLength++;
                }
                System.out.println();
            }
        } while (exitGame);

    }
}
