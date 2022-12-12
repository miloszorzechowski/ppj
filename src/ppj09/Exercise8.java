package ppj09;

public class Exercise8 {
    public static void main(String[] args) {
        char[] word = {'a', 'l', 'a'};
        System.out.println(isPalindrome(word, 0, 2));
    }

    private static boolean isPalindrome(char[] word, int start, int end) {
        if (word.length == 0 && word.length == 1) {
            return true;
        }

        if (start + 1 <= word.length / 2) {
            if (word[start] == word[end]) {
                isPalindrome(word, start + 1, end - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}