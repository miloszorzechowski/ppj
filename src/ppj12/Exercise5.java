package ppj12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        int fileCount = 3;
        int[] input = new int[fileCount];

        for (int fileNumber = 1; fileNumber <= fileCount; fileNumber++) {
            File file = new File(String.format("src/ppj12/inputData%d.txt", fileNumber));
            Scanner sc = new Scanner(file);
            input[fileNumber - 1] = sc.nextInt();
            sc.close();
        }

        Arrays.sort(input);

        FileWriter fw = new FileWriter("src/ppj12/output.txt");

        for (int number : input) {
            fw.write(String.format("%d ", number));
        }

        fw.close();
    }
}