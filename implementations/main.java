package implementations; // The package name is "implementations"
// import java.util.LinkedList;

class Main { // Class named Main

    public Main() {
        // Constructor for the Main class
    }

    public static void main(String[] args) {
        // task class instances
        Task makeDinner = new Task("Dinner", "Make dinner for family", "09-12-23", true);
        Task doHomework = new Task("Task 2", "Description 2", "09-12-24", false);

        // set pointer to next node
        makeDinner.setNext(doHomework);

        // Traversing the linked list and printing task details
        TaskNode current = makeDinner;
        while (current != null) {
            Task currentTask = current.getTask();
            System.out.println("Task Details: " + currentTask.getDetails());
            current = current.getNext();
        }
    }
}


// Seems to be an issue with setNext method