package ppj09.extra;

public class Exercise3 {
    private static String[] getCensoredArray(String[] words, String[] forbiddenWords) {
        int size = words.length - countForbiddenWords(words, forbiddenWords);
        String[] censoredArray = new String[size];
        int index = 0;

        for (String word : words) {
            if (!isForbidden(word, forbiddenWords)) {
                censoredArray[index++] = word;
            }
        }

        return censoredArray;
    }

    private static int countForbiddenWords(String[] words, String[] forbiddenWords) {
        int forbiddenWordsCount = 0;

        for (String word : words) {
            if (isForbidden(word, forbiddenWords)) {
                forbiddenWordsCount++;
            }
        }

        return forbiddenWordsCount;
    }

    private static boolean isForbidden(String word, String[] forbiddenWords) {
        boolean isForbidden = false;

        for (String forbiddenWord : forbiddenWords) {
            if (word.equals(forbiddenWord)) {
                isForbidden = true;
                break;
            }
        }

        return isForbidden;
    }
}