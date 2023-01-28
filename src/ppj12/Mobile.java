package ppj12;

public class Mobile extends Phone {
    protected String[] callHistory = new String[10];

    public Mobile(String communicationInterface, String color) {
        super(communicationInterface, color);
    }

    @Override
    public void call(String number) {
        super.call(number);

        String[] updatedCallHistory = new String[10];
        System.arraycopy(callHistory, 1, updatedCallHistory, 0, callHistory.length - 1);
        updatedCallHistory[callHistory.length - 1] = number;
        callHistory = updatedCallHistory;
    }

    @Override
    public void printCallHistory() {
        for (int index = callHistory.length - 1; index >= 0; index--) {
            System.out.println(callHistory[index]);
        }
    }
}