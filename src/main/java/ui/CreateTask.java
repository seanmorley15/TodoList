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
        setTitle("Create Task");
        setContentPane(CreateTask);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        titleText.setFont(titleText.getFont().deriveFont(Font.PLAIN, 30f));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Main().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        new CreateTask();
    }
}