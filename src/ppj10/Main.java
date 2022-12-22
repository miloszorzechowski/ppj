package ppj10;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Milosz";
        person.surname = "Orzechowski";
        person.birthyear = 2003;

        Square square = new Square(5);
        square.show();

        Cylinder cylinder = new Cylinder(3, 5);
        cylinder.show();

        riseDonkeyUp();
    }

    private static void riseDonkeyUp() {
        Donkey donkey = new Donkey(80);
        Balloon balloon;

        while (!donkey.isFlying()) {
            balloon = new Balloon();
            donkey.addBalloon(balloon);
        }
    }
}