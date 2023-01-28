package ppj10;

public class Balloon {
    private final double heliumAmount;

    public Balloon() {
        heliumAmount = 0.005 + Math.random() * ((0.009 - 0.005) + 0.001);
    }

    public double getLoad() {
        return heliumAmount * 6 / 0.007;
    }
}