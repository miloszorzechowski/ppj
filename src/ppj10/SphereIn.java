package ppj10;

public class SphereIn {
    private final int radius;

    public SphereIn(Cylinder cylinder) {
        radius = Math.min(cylinder.getRadius() * 2, cylinder.getHeight()) / 2;
    }

    public SphereIn(Square square) {
        radius = square.getSideLength() / 2;
    }
}