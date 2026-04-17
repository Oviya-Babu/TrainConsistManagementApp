import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UseCase11TrainConsistMgmt {

    // Regex Patterns (as per document)
    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    // 🔥 Business Logic (Testable)
    public static boolean isValidTrainID(String trainId) {
        if (trainId == null) return false;
        Pattern pattern = Pattern.compile(TRAIN_ID_REGEX);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean isValidCargoCode(String cargoCode) {
        if (cargoCode == null) return false;
        Pattern pattern = Pattern.compile(CARGO_CODE_REGEX);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC11 - Regex Validation ");
        System.out.println("========================================\n");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID: " + trainId);
        System.out.println("Cargo Code: " + cargoCode);

        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid? " + isValidTrainID(trainId));
        System.out.println("Cargo Code Valid? " + isValidCargoCode(cargoCode));
    }
}