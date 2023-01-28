public class CaesarCipher extends CipherGenerator {
    private int offset;

    public CaesarCipher(int offset) {
        super("Caesar Cipher");
        this.offset = offset % 26;
    }

    @Override
    public String encrypt(String content) throws unknownCharacterException {
        StringBuilder ciphertext = new StringBuilder();

        for (char letter : content.toUpperCase().toCharArray()) {
            if (Character.isSpaceChar(letter)) {
                ciphertext.append(letter);
                continue;
            }

            checkIfLetter(letter);

            int replacementAsciiCode = letter + offset;

            if (replacementAsciiCode > 'Z') {
                ciphertext.append((char) (replacementAsciiCode - 26));
            } else if (replacementAsciiCode < 'A') {
                ciphertext.append((char) (replacementAsciiCode + 26));
            } else {
                ciphertext.append((char) replacementAsciiCode);
            }
        }

        return ciphertext.toString();
    }

    @Override
    public String decrypt(String ciphertext) throws unknownCharacterException {
        offset *= -1;
        String decryptedContent = encrypt(ciphertext);
        offset *= -1;

        return decryptedContent;
    }
}