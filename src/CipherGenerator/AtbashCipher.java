package CipherGenerator;

public class PolybiusSquareCipher extends CipherGenerator {
    char[][] square = {
            "ABCDEF".toCharArray(),
            "GHIJKL".toCharArray(),
            "MNOPQR".toCharArray(),
            "STUVWX".toCharArray(),
            "YZ0123".toCharArray(),
            "456789".toCharArray()
    };

    @Override
    public String encrypt(String content) throws unknownCharacterException {
        for (char letter : content.toUpperCase().toCharArray()) {
            
        }
    }

    @Override
    public String decrypt(String ciphertext) throws unknownCharacterException {
        return null;
    }
}