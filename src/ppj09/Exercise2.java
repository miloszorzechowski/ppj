package ppj09;

public class Exercise2 {
    public static void main(String[] args) {
        char[] content = {'a', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        printElementsFrequency(content);
    }

    private static void printElementsFrequency(char[] content) {
        for (int i = 0, frequency = 1; i < content.length; i++) {
            if (content[i] == '\u0000') {
                continue;
            }

            for (int j = i + 1; j < content.length; j++) {
                if (content[j] == content[i]) {
                    frequency++;
                    content[j] = '\u0000';
                }
            }

            System.out.printf("\"%s\": %d%n", content[i], frequency);
        }
    }
}