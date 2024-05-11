package ui;

import com.formdev.flatlaf.FlatDarkLaf;
import core.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static core.TaskList.addTask;
import static core.TaskList.getTasks;

public class CreateTask extends JFrame {
    private JPanel CreateTask;
    private JButton backButton;
    private JLabel titleText;
    private JTextField nameInput;
    private JTextField descInput;
    private JButton submitButton;

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
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameInput.getText();
                String desc = descInput.getText();
                Task newTask = new Task(name, desc);
                addTask(newTask);
                System.out.println(getTasks().toString());
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