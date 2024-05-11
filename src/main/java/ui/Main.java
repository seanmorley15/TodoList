package ui;

import com.formdev.flatlaf.FlatDarkLaf;
import core.Task;
import core.TaskList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel MainPannel;
    private JLabel welcomeLabel;
    private JButton view;
    private JButton create;


    public Main() {
        setTitle("Create Task");
        setContentPane(MainPannel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(Font.PLAIN, 30f));
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new CreateTask().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        TaskList taskList = new TaskList();
        // instantiates a new taskList to store the tasks
        new Main();
    }
}