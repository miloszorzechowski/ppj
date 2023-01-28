import java.util.Arrays;

public class MorseCode extends CipherGenerator {
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

    public MorseCode() {
        super("Morse Code");
    }

    @Override
    public String encrypt(String content) throws unknownCharacterException {
        StringBuilder ciphertext = new StringBuilder();

        for (char letter : content.toUpperCase().toCharArray()) {
            if (Character.isSpaceChar(letter)) {
                ciphertext.append("/ ");
                continue;
            }

            checkIfLetter(letter);

            ciphertext.append(symbols[letter - 'A']).append(' ');
        }

        return ciphertext.toString();
    }

    @Override
    public String decrypt(String ciphertext) {
        StringBuilder plaintext = new StringBuilder();

        for (String symbol : ciphertext.split(" ")) {
            if (symbol.equals("/")) {
                plaintext.append(' ');
                continue;
            }

            plaintext.append((char) (Arrays.asList(symbols).indexOf(symbol) + 'A'));
        }

        return plaintext.toString();
    }
}