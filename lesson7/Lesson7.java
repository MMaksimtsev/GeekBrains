package lesson7;

import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int catCount;
        int foodCount;
        String catName;
        int catAppetite;

        System.out.println("How many cats do yo have?");
        catCount = console.nextInt();

        Cat[] cat = new Cat[catCount];
        Plate plate = new Plate(100);

        for (int i = 0; i <cat.length ; i++) {
            console.nextLine();

            System.out.println("Input name " + (i + 1) + " cat");
            catName =  console.nextLine();

            System.out.println("Input appetite " + (i + 1) + " cat");
            catAppetite = console.nextInt();
            cat[i] = new Cat(catName, catAppetite, false);
        }

        console.nextLine();

        for (Cat value : cat) {
            plate.info();
            System.out.println("Do you want increase food in plate for little cats, PRESS - Y");
            while (console.nextLine().equals("Y")) {
                System.out.println("enter amount of food");
                plate.setFood(console.nextInt());
                plate.info();
            }
            value.eat(plate);
            String catSatiety = (value.isSatiety()) ? "Cat full load" : "cat stomach is empty";
            System.out.println("Cat name = " + value.getName() + " " + " Satiety = " + catSatiety);
        }
        console.close();
    }
}
