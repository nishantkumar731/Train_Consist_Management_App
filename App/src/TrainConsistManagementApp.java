import java.util.LinkedHashSet;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Attempt to add duplicate bogie
        train.add("Sleeper"); // Duplicate (will be ignored)

        // Step 4: Display final train formation
        System.out.println("Final Train Formation:");
        for (String bogie : train) {
            System.out.println(bogie);
        }

        // Alternative direct print
        System.out.println("\nSet view: " + train);
    }
}