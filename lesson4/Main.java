package ru.geekbrains.lesson4;



import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_Y = 'Y';


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_Y)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <SIZE ; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        Scanner console = new Scanner(System.in);
        int x,y;
        do {
            System.out.println("Укажите координаты клетк, введите Х");
            x = console.nextInt() - 1;
            System.out.println("Укажите координаты клетк, введите Y");
            y = console.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static void aiTurn() {
        System.out.println("ai turn");
        Random random = new Random();
        int x,y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_Y;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static boolean checkWin(char symb) {
        int countWinDots;

        for (int i = 0; i < SIZE; i++) {
            countWinDots = 0;
            for (int k = 0; k < SIZE - i; k++) {
                for (int l = k + i; l < SIZE - i; ) {
                    if (map[k][l] == symb) {
                        countWinDots += 1;
                        if (countWinDots == DOTS_TO_WIN) return true;
                    } else {
                        countWinDots = 0;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            countWinDots = 0;
            for (int k = 0; k < SIZE - i; k++) {
                for (int l = k + i; l < SIZE - i; ) {
                    if (map[l][k] == symb) {
                        countWinDots += 1;
                        if (countWinDots == DOTS_TO_WIN) return true;
                    } else {
                        countWinDots = 0;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            countWinDots = 0;
            for (int k = 0; k < SIZE - i; k++) {
                for (int l = SIZE - k - i - 1; l >= 0; ) {
                    if (map[k][l] == symb) {
                        countWinDots += 1;
                        if (countWinDots == DOTS_TO_WIN) return true;
                    } else {
                        countWinDots = 0;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            countWinDots = 0;
            for (int k = 0; k < SIZE - i; k++) {
                for (int l = SIZE - k - i- 1; l >= 0; ) {
                    if (map[l][k] == symb) {
                        countWinDots += 1;
                        if (countWinDots == DOTS_TO_WIN) return true;
                    } else {
                        countWinDots = 0;
                    }
                    break;
                }
            }
        }
        for (int i = 0, j = 0; i < SIZE || j < SIZE; i++, j++) {
            countWinDots = 0;
            for (int k = i; k < SIZE; k++) {
                for (int l = j; l < SIZE; l++) {
                    if (map[k][l] == symb) {
                        countWinDots += 1;
                        if (countWinDots == DOTS_TO_WIN) return true;
                    } else {
                        countWinDots = 0;
                    }
                }
            }
        }
        countWinDots = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE || j >= 0 ; i++, j--) {
            if (map[i][j] == symb) {
                countWinDots += 1;
                if (countWinDots == DOTS_TO_WIN) return true;
            }
            else {
                countWinDots = 0;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            countWinDots = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    countWinDots += 1;
                    if (countWinDots == DOTS_TO_WIN) return true;
                } else {
                    countWinDots = 0;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            countWinDots = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {
                    countWinDots += 1;
                    if (countWinDots == DOTS_TO_WIN) return true;
                } else {
                    countWinDots = 0;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
