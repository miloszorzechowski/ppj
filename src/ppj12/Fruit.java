package ppj12;

import java.util.concurrent.ThreadLocalRandom;

public class Fruit {
    private String name;
    private double mass;

    public Fruit(String name) {
        this.name = name;
        this.mass = setRandomMass();
    }

    private double setRandomMass() {
        return ThreadLocalRandom.current().nextDouble(0.1, 0.25);
    }

    public double getMass() {
        return mass;
    }
}