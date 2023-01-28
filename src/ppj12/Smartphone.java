public class Smartphone extends CellPhone {
    private Person[] friends;

    public Smartphone(String communicationInterface, String color) {
        super(communicationInterface, color);
    }

    @Override
    public void printCallHistory() {
        for (String call : super.callHistory) {
            System.out.println(call);
        }
    }

    private Person matchNumberWithFriend() {

    }
}