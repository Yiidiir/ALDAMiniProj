import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import jade.util.leap.Serializable;

import javax.swing.*;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BlockchainAgent extends Agent {
    private ArrayList<Block> blocks = new ArrayList<>();
    JFrame frame;
    AgentGUI agent = new AgentGUI();
    private Wallet AgentWallet = new Wallet();
    private Block currentBlock = new Block(this.blocks.size() + 1, this.getAID());

    public BlockchainAgent() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException {
    }

    @Override
    protected void setup() {
        int randInt = new Random().nextInt((10 + 1) - 0) + 0;

        frame = new JFrame(this.getLocalName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(agent);
        frame.pack();
        frame.setVisible(true);
        agent.setAgentName(this.getLocalName());
        agent.setBlockChainInfo(this.AgentWallet.getPublicKey());

        agent.addTransaction.addActionListener(e -> {
            // Add transaction
            Transaction newT = new Transaction(this.AgentWallet.getPublicKey(), "sendTo", 2,
                    new ArrayList<Input>());

            this.currentBlock.setTransactions(new ArrayList<Transaction>(Arrays.asList(new Transaction[]{newT})));


            int nextTransNum = agent.currentTrans.getSize();
            agent.currentTrans.addElement("Transaction " + nextTransNum);


            System.out.println("Added transaction");
            agent.logStuff("Current block transactions: " + this.currentBlock.getTransactions().size());
        });

        agent.hashBlock.addActionListener(e -> {
            try {
                JOptionPane.showMessageDialog(agent, this.currentBlock.hashBlock());
                System.out.println(this.currentBlock.hashBlock());
            } catch (NoSuchAlgorithmException ex) {
                ex.printStackTrace();
            }
        });

        agent.mineBlock.addActionListener(e -> {
            JOptionPane.showMessageDialog(agent, "Mining Block "+currentBlock.getId()+"\n Target: "+currentBlock.getTarget()+"\n Nonce: "+currentBlock.getNonce());
        });
        agent.broadcastCurrentBlock.addActionListener(e -> {
            this.currentBlock.setId(this.blocks.size() + 1);
            addBehaviour(new broadcastBlock(this.currentBlock));
            agent.currentTrans.clear();
            this.blocks.add(currentBlock);
            currentBlock = new Block(this.blocks.size() + 1, this.getAID());

        });
        Block newBlock = new Block(randInt, this.getAID());
//        addBehaviour(new broadcastBlock(newBlock));
        addBehaviour(new receiveBlock());
    }

    public class broadcastBlock extends OneShotBehaviour {

        private Block blockToBroadcast;

        public broadcastBlock(Block b) {
            this.blockToBroadcast = b;
        }

        public void action() {
            System.out.println("Agent started: " + this.getAgent().getLocalName());

            for (int i = 1; i <= 6; i++) {
                if (!("Agent" + i).equals(this.getAgent().getLocalName())) {
                    ACLMessage m = new ACLMessage(ACLMessage.INFORM);
                    m.addReceiver(new AID("Agent" + i, AID.ISLOCALNAME));
                    try {
                        m.setContentObject((Serializable) this.blockToBroadcast); // "{id: "10", AID}"
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    send(m);
                    try {
                        System.out.println(this.getAgent().getLocalName() + ":: Envoyé le block: " + ((Block) (m.getContentObject())).getId() + " à Agent" + i);
                        agent.logStuff(":: Envoyé le block: " + ((Block) (m.getContentObject())).getId() + " à Agent" + i);
                    } catch (UnreadableException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public class receiveBlock extends CyclicBehaviour {
        public void action() {
            ACLMessage blockRecu = receive();
            if (blockRecu != null) {
                // الأشياء

                Block received = null;
                try {
                    received = (Block) blockRecu.getContentObject();
                } catch (UnreadableException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getAgent().getLocalName() + ">> Reçu le block: " + received.getId());
                agent.logStuff(">> Reçu le block: " + received.getId());

                blocks.add(received);

                agent.powArea.setText("Target: " + received.getTarget() + " \n Nonce: " + received.getNonce());

                System.out.println(this.getAgent().getLocalName() + "::::: " + blocks.toString());
                //
            }
        }
    }
}
