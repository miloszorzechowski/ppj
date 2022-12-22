package ppj10;

public class Cylinder {
    private final int radius;
    private final int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void show() {
        double surfaceArea = Math.PI * Math.pow(radius, 2);
        double volume = surfaceArea * height;

        System.out.println("Surface area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}