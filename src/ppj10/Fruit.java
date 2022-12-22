package ppj10;

public class Fruit {
    String name;
    double weight;

    public Fruit(String name) {
        this.name = name;
        weight = (Math.random() * (0.8 - 0.5)) + 0.5;
    }

    public void show() {
        System.out.println(weight);
    }
}