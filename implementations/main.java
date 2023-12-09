package implementations; // The package name is "implementations"
// import java.util.LinkedList;

class Main { // Class named Main

    public Main() {
        // Constructor for the Main class
    }

    public static void main(String[] args) {
        // The main method, the entry point of the program
        Task makeDinner = new Task("Dinner", "Make dinner for family", "09-12-23", true);
        String details = makeDinner.getDetails();
        System.out.println(details);
    }
}
