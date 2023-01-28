package ppj10;

public class SphereIn {
    private final double radius;

    public SphereIn(Cylinder cylinder) {
        radius = Math.min(cylinder.getRadius() * 2, cylinder.getHeight()) / 2.0;
    }

    public SphereIn(Square square) {
        radius = square.getSideLength() / 2.0;
    }
}