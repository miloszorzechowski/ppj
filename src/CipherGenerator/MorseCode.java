package CipherGenerator;

import java.util.Arrays;

public class MorseCodeCipherGenerator extends CipherGenerator {
    private final String[] symbols = {
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
    };

    @Override
    public String encrypt(String content) {
        StringBuilder ciphertext = new StringBuilder();

        for (char letter : content.toUpperCase().toCharArray()) {
            ciphertext.append(symbols[letter - 'A']).append(' ');
        }

        return ciphertext.toString();
    }

    @Override
    public String decrypt(String ciphertext) {
        StringBuilder plaintext = new StringBuilder();

        for (String symbol : ciphertext.split(" ")) {
            plaintext.append((char) (Arrays.asList(symbols).indexOf(symbol) + 'A'));
        }

        return plaintext.toString();
    }
}