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

        // Creating nodes and linking them, forming a linked list
        TaskNode node1 = new TaskNode(makeDinner);
        TaskNode node2 = new TaskNode(doHomework);
        
    
    
    }
}
