package ppj09.extra;

import java.util.Arrays;
import java.util.Objects;

public class Exercise3 {
    public static void main(String[] args) {
        String[] words = {"My", null, "is", "John", "Cena"};
        String[] forbiddenWords = {null, "Cena"};

        System.out.println(Arrays.toString(censor(words, forbiddenWords)));
    }

    private static String[] censor(String[] words, String[] forbiddenWords) {
        String[] censoredArr = new String[getForbiddenWordsFrequency(words, forbiddenWords)];



        return censoredArr;
    }

    private static int getForbiddenWordsFrequency(String[] words, String[] forbiddenWords) {
        int forbiddenWordsCount = 0;

        for (String forbiddenWord : forbiddenWords) {
            for (String word : words) {
                if (Objects.equals(word, forbiddenWord)) {
                    forbiddenWordsCount++;
                }
            }
        }

        return forbiddenWordsCount;
    }
}