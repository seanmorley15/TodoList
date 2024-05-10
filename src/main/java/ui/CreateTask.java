package ui;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateTask extends JFrame {
    private JPanel CreateTask;
    private JButton backButton;
    private JLabel titleText;

    public CreateTask() {
        JFrame frame = new JFrame("Create Task");
        frame.setContentPane(CreateTask);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        titleText.setFont(titleText.getFont().deriveFont(Font.PLAIN, 30f));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main main = new Main();
                main.setVisible(true);
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        new CreateTask();
    }

}
