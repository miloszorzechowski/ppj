package ppj12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        int fileCount = 3;

        for (int fileNumber = 1; fileNumber <= fileCount; fileNumber++) {
            FileWriter fw = new FileWriter(String.format("src/ppj12/inputData%d.txt", fileNumber));

            int[] randomNumbers = generateRandomArray(10);
            Arrays.sort(randomNumbers);

            for (int randomNumber : randomNumbers) {
                fw.write(String.format("%d ", randomNumber));
            }

            fw.close();
        }
    }

    private static int[] generateRandomArray(int count) {
        int[] randomNumbers = new int[count];

        for (int index = 0; index < 10; index++) {
            randomNumbers[index] = ThreadLocalRandom.current().nextInt(0, 10000);
        }

        return randomNumbers;
    }
}