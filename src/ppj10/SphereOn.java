package ppj10;

public class SphereOn {
    private final double radius;

    public SphereOn(Square square) {
        radius = (square.getSideLength() * Math.sqrt(2)) / 2;
    }

    public SphereOn(Cylinder cylinder) {
        radius = cylinder.getRadius();
    }
}