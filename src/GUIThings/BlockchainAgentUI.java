/*
 * Created by JFormDesigner on Wed Nov 17 12:25:44 WAT 2021
 */

package GUIThings;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class BlockchainAgentUI extends JFrame {
    public BlockchainAgentUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        scrollPane3 = new JScrollPane();
        textPane1 = new JTextPane();
        scrollPane4 = new JScrollPane();
        textArea2 = new JTextArea();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        setVisible(true);
        setMinimumSize(new Dimension(850, 850));
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("AgentName");
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 30));

        //---- button1 ----
        button1.setText("text");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }

        //---- button2 ----
        button2.setText("text");

        //---- button3 ----
        button3.setText("text");

        //---- button4 ----
        button4.setText("text");

        //---- button5 ----
        button5.setText("text");

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(textPane1);
        }

        //======== scrollPane4 ========
        {
            scrollPane4.setViewportView(textArea2);
        }

        //---- label2 ----
        label2.setText("Logs");

        //---- label3 ----
        label3.setText("Cl\u00e9 publique: ");

        //---- label4 ----
        label4.setText("PubKey");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(359, 359, 359)
                    .addComponent(label1)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3)
                        .addComponent(button4)
                        .addComponent(button5))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                        .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
                                    .addContainerGap())
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                    .addGap(181, 181, 181))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label4)
                            .addGap(0, 529, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(button1)
                            .addGap(7, 7, 7)
                            .addComponent(button2)
                            .addGap(7, 7, 7)
                            .addComponent(button3)
                            .addGap(7, 7, 7)
                            .addComponent(button4)
                            .addGap(7, 7, 7)
                            .addComponent(button5))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4)
                                .addComponent(label3))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
        );
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JList list1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JScrollPane scrollPane3;
    private JTextPane textPane1;
    private JScrollPane scrollPane4;
    private JTextArea textArea2;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public void setLabel1(String label1) {
        this.label1.setText(label1);
    }

    public void logStuff(String logg){
        this.textArea2.setText(this.textArea2.getText()+"\n"+logg);
    }

    public void setLabel4(String label) {
        this.label4.setText(label);
    }

}
