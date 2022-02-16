import jade.core.AID;
import jade.util.leap.Serializable;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Random;

public class Block implements Serializable {

    private int id;
    private int version;
    private int timestamp;
    private String HashPrevBlock;
    private int nonce = new Random().nextInt((100000 + 1) - 0) + 0;
    private int target = 1000;
    private String merkelRoot;
    private AID sender;
    private ArrayList<Transaction> data = new ArrayList<Transaction>();
    ;
    private String HashHeaderBlock;

    public Block(int id, AID sender) {
        this.id = id;
        this.sender = sender;
    }

    public int getId() {
        return id;
    }

    public static String getSHA(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return toHexString(md.digest(input.getBytes(StandardCharsets.UTF_8)));
    }

    public static String toHexString(byte[] hash) {
        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 32) {
            hexString.insert(0, '0');
        }
        return hexString.toString();
    }

    public void setTransactions(ArrayList<Transaction> data) {
        this.data.addAll(data);
    }

    public int getNonce() {
        return nonce;
    }

    public int getTarget() {
        return target;
    }

    public ArrayList<Transaction> getTransactions() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String hashBlock() throws NoSuchAlgorithmException {
        return getSHA(getSHA(this.id
                + this.version + this.timestamp + this.HashPrevBlock
                + this.nonce + this.target + this.merkelRoot
                + this.data.toString() + this.HashPrevBlock));
    }
}
