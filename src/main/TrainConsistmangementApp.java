import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistmangementApp {

    // Method to validate Train ID
    public static boolean isValidTrainId(String trainId) {
        String trainRegex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(trainRegex);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // Method to validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        String cargoRegex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(cargoRegex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC11 - Validate Train ID and Cargo Code");
        System.out.println("===========================================");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Validation
        boolean trainValid = isValidTrainId(trainId);
        boolean cargoValid = isValidCargoCode(cargoCode);

        // Output
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}