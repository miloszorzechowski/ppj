package ppj12;

import java.util.concurrent.ThreadLocalRandom;

public class Rocket {
    private final String name;
    private int fuelWeight;

    public Rocket(String name, int fuelWeight) {
        this.name = name;
        this.fuelWeight = fuelWeight;
    }

    public void refuel() {
        if (fuelWeight < 1000) {
            int fuelAmount = ThreadLocalRandom.current().nextInt(100, 1000 - fuelWeight + 1);
            fuelWeight += fuelAmount;
            System.out.printf("%s tonnes of fuel were refuelled\n", fuelAmount);
        } else {
            System.out.println("The tank is already fully fueled");
        }
    }

    public void launch() throws Exception {
        if (fuelWeight < 1000) {
            throw new Exception("Launch canceled - not enough fuel");
        }
    }
}