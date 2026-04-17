/**
 * =========================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * =========================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 *
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 *
 * This maps lookup-based access using HashMap.
 *
 * @author Oviya-Babu
 * @version 6.0
 */

import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        // Display header
        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("========================================\n");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- INSERT bogie capacities ----
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        // ---- DISPLAY capacity details ----
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Completion message
        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}