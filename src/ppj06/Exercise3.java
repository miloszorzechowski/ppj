package ppj06;

public class Exercise3 {
    public static void main(String[] args) {
        byte num = 0;
        char hexNum = (char) (num < 10 ? '0' + num : 'A' + num - 10);
    }
}