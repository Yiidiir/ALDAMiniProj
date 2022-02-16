import jade.util.leap.Serializable;

import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.ArrayList;

public class Transaction implements Serializable {

    public String transactionId; //
    public String sender;
    public String recipient;
    public float value;
    public byte[] signature;

    public ArrayList<Input> inputs = new ArrayList<Input>();
    public ArrayList<Output> outputs = new ArrayList<Output>();

    private static int sequence = 0;

    // Constructor: 
    public Transaction(String from, String to, float value, ArrayList<Input> inputs) {
        this.sender = from;
        this.recipient = to;
        this.value = value;
        this.inputs = inputs;
    }


    private String calulateHash() throws NoSuchAlgorithmException {
        sequence++;

        return new String(MessageDigest.getInstance("SHA-256").digest((
                sender +
                        recipient +
                        Float.toString(value) + sequence).getBytes(StandardCharsets.UTF_8)));
    }


}