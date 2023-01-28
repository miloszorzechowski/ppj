package ppj12;

public class Main {
    public static void main(String[] args) {
        exercise7();
    }

    private static void exercise5() {
        Phone phone = new Phone("123", "black");
        Mobile mobile = new Mobile("456", "silver");
        Smartphone smartphone = new Smartphone("789", "white");

        Phone[] phones = {phone, mobile, smartphone};

        Person person1 = new Person("Ivan", "Armstrong", "111");
        Person person2 = new Person("Yahya", "Reeves", "222");
        Person person3 = new Person("Jazmin", "Lester", "333");
        Person person4 = new Person("Alexia", "Frost", "444");
        Person person5 = new Person("Gabrielle", "Cameron", "555");

        Person[] persons = {person1, person2, person3, person4, person5};

        for (Person p : persons) {
            smartphone.addFriend(p);
        }

        for (Phone p : phones) {
            System.out.printf("--- %s ---\n", p.getClass().getSimpleName());
            for (int i = 1, j = 0; i <= 10; i++) {
                if (p instanceof Smartphone && i % 2 == 0) {
                    p.call(persons[j++].phoneNumber());
                } else {
                    int randomNumber = 100 + (int) (Math.random() * ((999 - 100) + 1));
                    p.call(String.valueOf(randomNumber));
                }
            }

            System.out.println("\nCall history: ");
            p.printCallHistory();
            System.out.print("\n");
        }
    }

    private static void exercise7() {
        Fruit[] pickedFruits = new Fruit[100];
        double totalWeight = 0;
        byte index = 0;

        byte appleCount = 0;
        byte orangeCount = 0;
        byte pearCount = 0;

        do {
            Fruit pickedFruit = FruitTree.pickFruit();
            pickedFruits[index++] = pickedFruit;
            totalWeight += pickedFruit.getMass();

            switch (pickedFruit.getClass().getSimpleName()) {
                case "Apple" -> appleCount += 1;
                case "Orange" -> orangeCount += 1;
                case "Pear" -> pearCount += 1;
            }
        } while (totalWeight < 5);

        System.out.printf("Apples picked: %d\n", appleCount);
        System.out.printf("Oranges picked: %d\n", orangeCount);
        System.out.printf("Pears picked: %d\n", pearCount);
    }
}