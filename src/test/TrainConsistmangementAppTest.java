import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainConsistmangementAppTest {

    @Test
    void testTotalSeatCalculation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        int total = TrainConsistmangementApp.calculateTotalCapacity(bogies);

        assertEquals(222, total);
    }

    @Test
    void testEmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        int total = TrainConsistmangementApp.calculateTotalCapacity(bogies);

        assertEquals(0, total);
    }

    @Test
    void testSingleBogie() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 50));

        int total = TrainConsistmangementApp.calculateTotalCapacity(bogies);

        assertEquals(50, total);
    }
}