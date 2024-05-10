package ui;

import com.formdev.flatlaf.FlatDarkLaf;
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
        setTitle("Todo List");
        setContentPane(MainPannel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(Font.PLAIN, 30f));
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTask createTask = new CreateTask();
                createTask.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        TaskList taskList = new TaskList(); // instantiates a new taskList to store the tasks
        new Main();
    }
}