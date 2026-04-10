import java.util.HashSet;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create HashSet for storing unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG102"); // Duplicate

        // Step 3: Display all unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        // Alternative (direct print)
        System.out.println("\nSet view: " + bogieIDs);
    }
}