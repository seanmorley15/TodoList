package ui;

import com.formdev.flatlaf.FlatDarkLaf;
import core.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static core.TaskList.getTasks;

public class ViewTasks extends JFrame {
    private JLabel titleText;
    private JList taskList;
    private JPanel taskFrame;
    private JButton backButton;

    public ViewTasks() {
        setTitle("Create Task");
        setContentPane(taskFrame);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        titleText.setFont(titleText.getFont().deriveFont(Font.PLAIN, 30f));
        ArrayList<Task> tasks = getTasks();

        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Task task : tasks) {
            listModel.addElement(task.toString());
        }

        // Set the model for the JList
        taskList.setModel(listModel);

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
        new ViewTasks();
    }
}
