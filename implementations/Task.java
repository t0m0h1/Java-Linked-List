package implementations;

public class Task {
    private String name;
    private String description;
    private String date;
    private boolean priority; // High or low

    // Constructor should take parameters to initialize the object
    public Task(String name, String description, String date, boolean priority) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.priority = priority;
    }

    // Getter for task name
    public String getName() {
        return name;
    }

    // Getter for task description
    public String getDescription() {
        return description;
    }

    // Getter for task date
    public String getDate() {
        return date;
    }

    // Getter for task priority
    public boolean getPriority() {
        return priority;
    }

    // Method to get details of the task
    public String getDetails() {
        // You can format the details as per your requirement
        return "Name: " + name + ", Description: " + description + ", Date: " + date + ", Priority: " + (priority ? "High" : "Low");
    }
}
