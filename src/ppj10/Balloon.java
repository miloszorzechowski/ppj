package ppj10;

public class Balloon {
    private final double heliumAmount;
    public Balloon() {
        heliumAmount = Math.random() * (0.009 - 0.005) + 0.005;
    }

    public double getLoad() {
        return heliumAmount * 6 / 0.007;
    }
}