package ru.netology.javaqa;
public class Epic extends Task {
    private String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public boolean matches(String query) {
        for (String tasks : subtasks) {
            if (tasks.contains(query)) {
                return true;
            }
        }
        return false;
    }

    public String[] getSubtasks() {
        return subtasks;
    }
}
