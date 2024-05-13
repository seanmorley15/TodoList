package ui;

import com.formdev.flatlaf.FlatDarkLaf;
import core.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static core.TaskList.*;

public class ViewTasks extends JFrame {
    private JLabel titleText;
    private JList taskList;
    private JPanel taskFrame;
    private JButton backButton;
    private JButton completeButton;
    private JButton deleteButton;

    public ViewTasks() {
        setTitle("Create Task");
        setContentPane(taskFrame);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);
        setLocationRelativeTo(null);
        setVisible(true);
        titleText.setFont(titleText.getFont().deriveFont(Font.PLAIN, 30f));
        updateListDisplay();
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Main().setVisible(true);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) taskList.getSelectedValue();
                System.out.println(selected);
                int index = taskList.getSelectedIndex();
                taskList.remove(index); // remove from local array
                removeTask(index); // remove and save globally
                updateListDisplay(); // update the JList
            }
        });
        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = taskList.getSelectedIndex();
                Task task = getTask(index);
                updateStatus(index);


            }
        });
    }

    public static void main(String[] args) {
        FlatDarkLaf.setup();
        new ViewTasks();
    }

    private void updateListDisplay() {
        ArrayList<Task> tasks = getTasks();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Task task : tasks) {
            listModel.addElement(task.toString());
        }
        // Set the model for the JList
        // adds to the JList
        taskList.setModel(listModel);
    }
    public void updateStatus(int index) {
        ArrayList<Task> tasks = getTasks();
        Task task = tasks.get(index);
        task.setDone(!task.isDone());
        tasks.set(index, task);
        setTaskList(tasks);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Task t : tasks) {
            listModel.addElement(t.toString());
        }
        // Set the model for the JList
        // adds to the JList
        taskList.setModel(listModel);
    }
 }
