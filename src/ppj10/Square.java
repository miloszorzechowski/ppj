package ppj10;

public class Square {
    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public void show() {
        int area = sideLength * sideLength;
        int volume = area * sideLength;

        System.out.println("Area of the square: " + area);
        System.out.println("Volume of the cube: " + volume);
    }

    public int getSideLength() {
        return sideLength;
    }
}