package ppj12;

import java.util.concurrent.ThreadLocalRandom;

public class FruitTree {
    public static Fruit pickFruit() {
        Fruit randomFruit;
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 3);

        if (randomNumber == 0) {
            randomFruit = new Apple();
        } else if (randomNumber == 1) {
            randomFruit = new Orange();
        } else {
            randomFruit = new Pear();
        }

        return randomFruit;
    }
}