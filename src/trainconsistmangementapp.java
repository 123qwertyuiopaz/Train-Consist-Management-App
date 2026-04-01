import java.util.ArrayList;

public class trainconsistmangementapp {
        public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("====================================");

        // Step 1: Create ArrayList
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display after adding
        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Step 4: Remove "AC Chair"
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Step 5: Check if "Sleeper" exists
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        // Step 6: Final consist
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}