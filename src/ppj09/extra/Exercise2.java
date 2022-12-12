package ppj09.extra;

public class Exercise2 {
    private static String[] reverse(String[] arr) {
        String[] reversedArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        return reversedArr;
    }
}