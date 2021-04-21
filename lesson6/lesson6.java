package lesson6;

public class lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 40, 20);
        Dog dog = new Dog("Бобик", 1111, 5);

        cat.run(cat.name, cat.runDistance);
        cat.swim(cat.name, cat.swimDistance);

        dog.run(dog.name, dog.runDistance);
        dog.swim(dog.name, dog.swimDistance);
    }
}
