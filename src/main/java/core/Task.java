package core;

import java.io.Serial;
import java.io.Serializable;

public class Task implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private String description;
    private boolean done;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.done = false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
    }
    public String toString() {
        return "Task [name=" + name + ", description=" + description + ", done=" + done + "]";
    }
}
