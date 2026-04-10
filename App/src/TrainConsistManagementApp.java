import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Display initial train
        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Step 4: Insert Pantry Car at position 2 (index 2)
        train.add(2, "Pantry Car");

        // Step 5: Display after insertion
        System.out.println("\nAfter adding Pantry Car:");
        System.out.println(train);

        // Step 6: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Step 7: Display final train consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}