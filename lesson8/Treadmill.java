package lesson8;

public class Treadmill extends Obstacle{

    private String obstacleName ;
    private int value;

    public Treadmill (String obstacleName, int value){
        super(obstacleName, value);
        this.obstacleName = obstacleName;
        this.value = value;
    }
    public String getObstacleName() {
        return obstacleName;
    }

    public int getValue() {
        return value;
    }
}
