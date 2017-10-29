/**
 * Created by awhit on 10/24/2017.
 */
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;



public class Encryption {
    private static final String algorithm = "AES";
    private static final byte[] keyValue = new byte[]{'S','i','x','t','e','e','n','l','e','t','t','e','r','s','h','m'};

    public static String Encrypt(String in) throws Exception{
        Key key = generateKey();
        Cipher c = Cipher.getInstance(algorithm);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(in.getBytes());
        String out = new BASE64Encoder().encode(encVal);
        return out;
    }

    public static String Decrypt(String in) throws Exception{
        Key key = generateKey();
        Cipher c = Cipher.getInstance(algorithm);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedValue = new BASE64Decoder().decodeBuffer(in);
        byte[] decValue = c.doFinal(decodedValue);
        String out = new String(decValue);
        return out;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, algorithm);
        return key;
    }
}
