import java.util.Random;

public abstract class CipherGenerator {
    private final String name;
    private final String codeName;

    public CipherGenerator(String codeName) {
        name = generateRandomString();
        this.codeName = codeName;
    }

    public abstract String encrypt(String content) throws unknownCharacterException;

    public abstract String decrypt(String ciphertext) throws unknownCharacterException;

    protected void checkIfLetter(char character) throws unknownCharacterException {
        if (!Character.isLetter(character)) {
            String message = String.format("Character \"%c\" is not part of the alphabet", character);
            throw new unknownCharacterException(message);
        }
    }

    private String generateRandomString() {
        Random random = new Random();
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 10;

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    @Override
    public String toString() {
        return String.format("<%s> %s", name, codeName);
    }
}