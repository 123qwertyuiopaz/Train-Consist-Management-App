import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistmangementApp {

    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("====================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        int total = calculateTotalCapacity(bogies);

        System.out.println("\nTotal Seating Capacity of Train: " + total);
        System.out.println("\nUC10 aggregation completed...");
    }
}