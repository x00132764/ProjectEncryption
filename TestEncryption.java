/**
 * Created by awhit on 10/25/2017.
 */
public class TestEncryption {

    public static void main(String[] args) {
        String test = "encrypted string";
        String testEnc = Encryption.Encrypt(test);
        String testDecrypt = Encryption.Decrypt(testEnc);

        System.out.println("string to encrypt: " + test);
        System.out.println("Encrypted string: " + testEnc);
        System.out.println("Decrypted String: " + testDecrypt);
    }
}
