package lesson6;

public class Dog extends Animals {
    static int countDog = 0;
    private final int MAX_SWIM_DISTANCE = 10;
    private final int MAX_RUN_DISTANCE = 500;


    Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    void run(String name, int runDistance) {
        if (runDistance <= MAX_RUN_DISTANCE) {
            super.run(name, runDistance);
        } else {
            System.out.println("Собака не может преодалеть эту дистанцию");
        }
    }

    @Override
    void swim(String name, int swimDistance) {
        if (swimDistance <= MAX_SWIM_DISTANCE) {
            super.swim(name, swimDistance);
        } else {
            System.out.println("Собака не может проплыть эту дистанцию");
        }

    }
}

