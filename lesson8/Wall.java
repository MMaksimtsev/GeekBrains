package lesson8;

public class Wall extends Obstacle{

    private String obstacleName;
    private int value;

    public Wall(String obstacleName, int value){
        super(obstacleName, value);
    }
    public String getObstacleName() {
        return obstacleName;
    }

    public int getValue() {
        return value;
    }
}
