package lesson6;

import java.util.Scanner;

public class lesson6 {



    public static void main(String[] args) {
        String name;
        int runDistance;
        int swimDistance;
        String userAnswer;
        Scanner console = new Scanner(System.in);

        do {
            System.out.println("Введите имя кошки");
            name = console.nextLine();
            System.out.println("Введите дистанцию которую пробежала кошка");
            runDistance =  console.nextInt();
            System.out.println("Введите дистанцию которую проплыла кошка");
            swimDistance = console.nextInt();
            createCat(name, runDistance, swimDistance);

            console.nextLine();

            System.out.println("Введите имя собаки");
            name = console.nextLine();
            System.out.println("Введите дистанцию которую пробежала собака");
            runDistance =  console.nextInt();
            System.out.println("Введите дистанцию которую проплыла собака");
            swimDistance = console.nextInt();
            createDog(name, runDistance, swimDistance);

            console.nextLine();

            System.out.println("Хотите создать еще одно животное? Если - ДА введите Y");
            userAnswer = console.nextLine();
        } while (userAnswer.equals("Y"));

    console.close();
    }
    private static void createCat(String name, int runDistance, int swimDistance) {
        Cat cat = new Cat(name, runDistance, swimDistance);
        cat.run(name, runDistance);
        cat.swim(name, swimDistance);
        System.out.println("Созданных котов = " + ++Cat.countCat);
        System.out.println("Созданных животных = " + ++Animals.countAnimals);
    }

    private static void createDog (String name, int runDistance, int swimDistance) {
        Dog dog = new Dog(name, runDistance,swimDistance);
        dog.run(name, runDistance);
        dog.swim(name, swimDistance);
        System.out.println("Созданных собак = " + ++Dog.countDog);
        System.out.println("Созданных животных = " + ++Animals.countAnimals);
    }

}
