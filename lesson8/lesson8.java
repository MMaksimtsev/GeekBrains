package lesson8;

public class lesson8 {
    public static void main(String[] args) {
        Skills[] skill = new Skills[3];
        skill[0] = new Cat("Tom", "Cat", 20, 20);
        skill[1] = new Robot("R2D2", "Robot", 100, 20);
        skill[2] = new Person("Mike", "Person", 50, 10);
        Obstacle[] obstacle = new Obstacle[4];
        obstacle[0] = new Treadmill("First treadmill", 10);
        obstacle[1] = new Wall("First wall", 5);
        obstacle[2] = new Treadmill("Second treadmill", 20);
        obstacle[3] = new Wall("Second wall", 10);
        if (obstacle[0].getClass() == lesson8.)
        skill[0].jump(obstacle[0]);
    }


}
