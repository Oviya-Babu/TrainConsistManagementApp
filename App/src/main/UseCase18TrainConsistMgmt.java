public class UseCase18TrainConsistMgmt {

    // 🔥 Linear Search Logic
    public static boolean linearSearch(String[] bogieIds, String searchId) {

        for (String id : bogieIds) {

            if (id.equals(searchId)) {
                return true; // found → stop early
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("========================================\n");

        // Step 1: Create array
        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        // Step 2: Search key
        String searchId = "BG309";

        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // Step 3: Perform search
        boolean found = linearSearch(bogieIds, searchId);

        // Step 4: Display result
        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " FOUND ✅");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND ❌");
        }

        System.out.println("\nUC18 search completed...");
    }
}