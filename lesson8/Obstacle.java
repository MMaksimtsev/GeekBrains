package lesson8;

import java.util.SplittableRandom;

public class Obstacle {

    private String obstacleName;
    private int value;

    public Obstacle(String obstacleName, int value){
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
