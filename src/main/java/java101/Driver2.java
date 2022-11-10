package java101;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(20);
        panel.add(textField);
        JButton button = new JButton();
        button.setText("Print Text");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
