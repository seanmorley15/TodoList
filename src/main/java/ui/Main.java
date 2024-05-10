package ui;

import com.formdev.flatlaf.FlatDarkLaf;
import core.Task;
import core.TaskList;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JPanel MainPannel;
    private JLabel welcomeLabel;

    public Main() {
        setTitle("Todo List");
        setContentPane(MainPannel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(Font.PLAIN, 30f));
    }

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        TaskList taskList = new TaskList();
        Task task1 = new Task("Get book", "need it now");
        taskList.addTask(task1);
        System.out.println(taskList.getTasks());
        new Main();
    }
}