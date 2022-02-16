import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.security.*;
import java.security.spec.ECGenParameterSpec;

public class Wallet {
    private PrivateKey privateKey;
    private PublicKey publicKey;
    private float value;


    public Wallet() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        ECGenParameterSpec ecSpec = new ECGenParameterSpec("secp256k1");
        keyGen.initialize(ecSpec);
        KeyPair kp = keyGen.generateKeyPair();

        this.publicKey = kp.getPublic();
        this.privateKey = kp.getPrivate();
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public String getPublicKey() {
        return Base64.encode(this.publicKey.getEncoded(), Base64.BASE64DEFAULTLENGTH);
    }

    public float getValue() {
        return value;
    }
}
