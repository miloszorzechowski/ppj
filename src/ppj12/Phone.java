public class Phone {
    private String communicationInterface;
    private String color;

    public Phone(String communicationInterface, String color) {
        this.communicationInterface = communicationInterface;
        this.color = color;
    }

    public void call(String number) {
        System.out.printf("Calling %s...%n", number);
    }

    public void printCallHistory() {
        System.out.println("No history");
    }
}