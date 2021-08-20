package lesson8;

public class Person implements Skills {

    public Person(String name, String type, int maxDistance, int maxHeight) {
        this.name = name;
        this.type = type;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.fatigue = true;

    }

    public String getName() {
        return name;
    }

    private String name;
    private String type;
    private int maxDistance;
    private int maxHeight;
    private boolean fatigue;

    public void jump(Obstacle obstacle){

    }

    public void run(Treadmill treadmill){

    }


}
