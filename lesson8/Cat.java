package lesson8;

public class Cat implements Skills{
    public Cat(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }
    private String name;
    private int maxDistance;
    private int maxHeight;


    public boolean jump(Obstacle obstacle){
        if (this.maxHeight > obstacle.getValue()) {
            System.out.println(this.name + " перепрыгнул " + obstacle.getObstacleName() + " высотой " + obstacle.getValue());
            return true;
        }
        System.out.println(this.name + " не перепрыгнул " + obstacle.getObstacleName() + " высоту " + obstacle.getValue());
        return false;
    }

    public boolean run(Obstacle obstacle){
        if (this.maxDistance > obstacle.getValue()) {
            System.out.println(this.name + " пробежал " + obstacle.getObstacleName() + " длинной " + obstacle.getValue());
            return true;
        }
        System.out.println(this.name + " не пробежал " + obstacle.getObstacleName() + " длинной " + obstacle.getValue());
        return false;
    }
}
