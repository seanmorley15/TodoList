package core;

import java.io.*;
import java.util.ArrayList;

public class TaskList implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static ArrayList<Task> tasks;

    public TaskList() {
        tasks = loadTasksFromFile();
    }

    public static void addTask(Task task) {
        tasks.add(task);
        saveTasksToFile();
    }

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    private static void saveTasksToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tasks.dat"))) {
            out.writeObject(tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static ArrayList<Task> loadTasksFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("tasks.dat"))) {
            return (ArrayList<Task>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public static void removeTask(int index) {
        tasks.remove(index);
        saveTasksToFile();
    }

    public static Task getTask(int index) {
        return tasks.get(index);
    }

    public static void setTaskList(ArrayList<Task> t) {
        tasks = t;
        saveTasksToFile();
    }
}