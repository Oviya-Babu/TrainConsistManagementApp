import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    // 🔥 Binary Search Logic
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // found
            } 
            else if (comparison < 0) {
                high = mid - 1; // search left
            } 
            else {
                low = mid + 1; // search right
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("========================================\n");

        // Step 1: Create array (unsorted)
        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        // Step 2: Sort before binary search (IMPORTANT)
        Arrays.sort(bogieIds);

        // Step 3: Search key
        String key = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Step 4: Perform search
        boolean found = binarySearch(bogieIds, key);

        // Step 5: Display result
        if (found) {
            System.out.println("\n\nBogie ID " + key + " FOUND ✅");
        } else {
            System.out.println("\n\nBogie ID " + key + " NOT FOUND ❌");
        }

        System.out.println("\nUC19 search completed...");
    }
}