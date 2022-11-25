package ppj07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        char[] chars = new char[5];

        for (int i = 0; i < chars.length; i++)
            chars[i] = (char) ('A' + Math.random() * ('Z' + 1 - 'A'));

        System.out.println(chars);

        Scanner sc = new Scanner(System.in);
        char entered_char;
        byte char_occurrences = 0;
        byte counter = 0;

        while (counter < chars.length) {
            System.out.print("Enter char: ");
            entered_char = sc.next().charAt(0);

            for (int i = 0; i < chars.length; i++)
                if (chars[i] == entered_char) {
                    char_occurrences++;
                    chars[i] = '0';
                    counter++;
                }

            System.out.printf("%s occurrences: %d%n", entered_char, char_occurrences);

            char_occurrences = 0;
        }

        System.out.println(Arrays.toString(chars));
    }
}