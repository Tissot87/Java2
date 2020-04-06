package Lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ChatWindow extends JFrame {
    private final JTextField textField = new JTextField();
    private JTextArea jta = new JTextArea();




    public ChatWindow() {
        setTitle("Chat window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 100, 500, 500);
        setMinimumSize(new Dimension(500, 500));
        setVisible(true);

        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.95;
        c.gridx = 0;
        c.gridy = 1;
        textField.addActionListener(this::reactToAction);
        textField.addKeyListener(new CustomKeyListener());
        add(textField, c);

        JButton button = new JButton("Отправить");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.05;
        c.gridx = 1;
        c.gridy = 1;
        button.addActionListener(this::reactToAction);
        add(button, c);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        c.fill = GridBagConstraints.NONE;
        c.gridwidth = 2;
        c.gridy = 0;
        c.gridx = 0;
        c.ipady = 400;
        c.ipadx = 500;
        jta.setForeground(Color.black);
        jta.setEditable(false);
        add(jta, c);






        setVisible(true);
    }

    void sendMessage() {
        String out = textField.getText();
        jta.append(out + "\n");
    }


    private void reactToAction(ActionEvent event) {
      //  JOptionPane.showMessageDialog(null, textField.getText());
        sendMessage();
        textField.setText(null);
    }
    private static class CustomKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {

        }
    }




    public static void main(String[] args) {
        new ChatWindow();
    }

}
