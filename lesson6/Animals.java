package lesson6;

public class Animals {

    protected String name;
    protected int runDistance;
    protected int swimDistance;
    static int countAnimals = 0;

    Animals(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    void run(String name, int runDistance) {
        System.out.println(name + " Пробежал " + runDistance + " м.");
    }

    void swim(String name, int swimDistance) {
        System.out.println(name + " Проплыл " + swimDistance + " м.");
    }
}
