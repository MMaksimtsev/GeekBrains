package lesson7;

import java.util.Scanner;

public class Lesson7 {
    private static int catCount;
    private static String catName;
    private static int catAppetite;
    private static boolean catSatiety = false;
    private static Scanner console = new Scanner(System.in);
    private static Cat[] cat;


    public static void main(String[] args) {
        System.out.println("How many cats do you have?");
        catCount = console.nextInt();

        crateCat();
        printCatInfo();
        console.close();
    }

    private static void crateCat() {
        cat = new Cat[catCount];
        for (int i = 0; i < cat.length; i++) {
            console.nextLine();

            System.out.println("Input name " + (i + 1) + " cat");
            catName = console.nextLine();

            System.out.println("Input appetite " + (i + 1) + " cat");
            catAppetite = console.nextInt();
            cat[i] = new Cat(catName, catAppetite, catSatiety);
        }
    }

    private static void printCatInfo() {
        Plate plate = new Plate(100);
        console.nextLine();
        for (Cat value : cat) {
            plate.info();
            System.out.println("Do you want increase food in plate for little kitty, PRESS - Y");
            while (console.nextLine().equals("Y")) {
                System.out.println("enter amount of food");
                plate.setFood(console.nextInt());
                plate.info();
            }
            value.eat(plate);
            String catSatiety = (value.isSatiety()) ? "Cat full load" : "cat's stomach is empty";
            System.out.println("Cat name = " + value.getName() + " " + " Satiety = " + catSatiety);
        }
    }
}
