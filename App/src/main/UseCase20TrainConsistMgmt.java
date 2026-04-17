public class UseCase20TrainConsistMgmt {

    // 🔥 Search with validation (Linear Search used here)
    public static boolean searchBogie(String[] bogieIds, String searchId) {

        // 🔥 FAIL-FAST VALIDATION
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search!");
        }

        // 🔍 Search logic
        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC20 - Exception Handling in Search ");
        System.out.println("========================================\n");

        // Case 1: Empty array (will throw exception)
        String[] bogieIds = {};

        String searchId = "BG101";

        try {
            boolean found = searchBogie(bogieIds, searchId);

            if (found) {
                System.out.println("Bogie FOUND ✅");
            } else {
                System.out.println("Bogie NOT FOUND ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}