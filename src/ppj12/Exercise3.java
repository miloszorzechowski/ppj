package ppj12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/ppj12/zad1.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;

        while (sc.hasNextLine()) {
            sum += sc.nextInt();
        }

        sc.close();

        System.out.println(sum);
    }
}