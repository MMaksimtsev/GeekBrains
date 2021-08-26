package lesson6;

public class Cat extends Animals {
    public static int countCat = 0;
    private final int MAX_RUN_DISTANCE = 500;


    Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    void run(String name, int runDistance) {
        if (runDistance <= MAX_RUN_DISTANCE) {
            super.run(name, runDistance);
        } else {
            System.out.println("Кот не может преодалеть эту дистанцию");
        }
    }

    @Override
    void swim(String name, int swimDistance) {
        System.out.println("Кот не умеет плавать");
    }
}

