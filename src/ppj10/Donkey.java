package ppj10;

public class Donkey {
    private final double mass;
    private Balloon[] balloons = {};

    public Donkey(double mass) {
        this.mass = mass;
    }

    public void addBalloon(Balloon balloon) {
        Balloon[] newBalloons = new Balloon[balloons.length + 1];
        int index = 0;

        for (Balloon element : balloons) {
            newBalloons[index++] = element;
        }

        newBalloons[index] = balloon;
        balloons = newBalloons;
    }

    public boolean isFlying() {
        double totalCapacityGrams = 0;

        for (Balloon balloon : balloons) {
            totalCapacityGrams += balloon.getLoad();
        }

        if (totalCapacityGrams >= mass * 1000) {
            System.out.println("Ja latam!!!");
            return true;
        }

        return false;
    }
}