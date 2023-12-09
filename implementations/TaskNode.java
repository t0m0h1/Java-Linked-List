package implementations;

public class TaskNode {
    private Task task;
    private TaskNode next;

    // Constructor
    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }

    // Getter and setter methods
    public Task getTask() {
        return task;
    }

    public TaskNode getNext() {
        return next;
    }

    public void setNext(TaskNode next) {
        this.next = next;
    }
}

