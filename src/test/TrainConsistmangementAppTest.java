import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistmangementAppTest {

    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC", 50));

        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC", 50));

        long count = bogies.stream()
                .filter(b -> b.capacity > 60)
                .count();

        assertEquals(1, count);
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        assertTrue((end - start) >= 0);
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC", 80));
        bogies.add(new Bogie("General", 40));

        // Loop count
        int loopCount = 0;
        for (Bogie b : bogies) {
            if (b.capacity > 60) loopCount++;
        }

        // Stream count
        long streamCount = bogies.stream()
                .filter(b -> b.capacity > 60)
                .count();

        assertEquals(loopCount, streamCount);
    }
}