package ppj05;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of words: ");
        int words_number = sc.nextInt();

        String[] arr = new String[words_number];

        for (int i = 0; i < words_number; i++) {
            System.out.printf("Word %d: ", i + 1);
            arr[i] = sc.next();
        }

        System.out.print("Entered words: ");
        for (String s : arr) {
            System.out.print(s + ", ");
        }
    }
}