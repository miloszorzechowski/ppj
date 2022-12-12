package ppj09.extra;

public class Exercise1 {
    private static int getFrequency(char[] content, char symbol) {
        int frequency = 0;

        for (char c : content) {
            if (c == symbol) {
                frequency++;
            }
        }

        return frequency;
    }
}