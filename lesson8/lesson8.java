package lesson8;

public class lesson8 {
    public static void main(String[] args) {
        Skills[] skill = new Skills[3];
        skill[0] = new Cat("Tom", 20, 20);
        skill[1] = new Robot("R2D2", 100, 20);
        skill[2] = new Person("Mike", 50, 10);
        Obstacle[] obstacle = new Obstacle[4];
        obstacle[0] = new Treadmill("Первая дорожка", 10);
        obstacle[1] = new Wall("Первая стена", 5);
        obstacle[2] = new Treadmill("Вторая дорожка", 20);
        obstacle[3] = new Wall("Вторая стена", 10);
        testingCreature(skill, obstacle);
    }
     public static void testingCreature (Skills[] skill, Obstacle[] obstacle) {
         for (Skills skills : skill) {
             for (Obstacle value : obstacle) {
                 if (value instanceof Treadmill) {
                     if (!(skills.run(value))) {
                         break;
                     }
                 } else if (value instanceof Wall) {
                     if (!(skills.jump(value))) {
                         break;
                     }
                 }
             }
         }
     }


}
