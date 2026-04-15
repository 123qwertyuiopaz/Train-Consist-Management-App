import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistmangementAppTest {

    @Test
    void testValidCapacityCreation() throws Exception {
        TrainConsistmangementApp.PassengerBogie b =
                new TrainConsistmangementApp.PassengerBogie("Sleeper", 50);

        assertEquals(50, b.capacity);
    }

    @Test
    void testNegativeCapacityThrowsException() {
        Exception exception = assertThrows(
                TrainConsistmangementApp.InvalidCapacityException.class,
                () -> new TrainConsistmangementApp.PassengerBogie("Sleeper", -10)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testZeroCapacityThrowsException() {
        assertThrows(
                TrainConsistmangementApp.InvalidCapacityException.class,
                () -> new TrainConsistmangementApp.PassengerBogie("AC", 0)
        );
    }

    @Test
    void testObjectIntegrity() throws Exception {
        TrainConsistmangementApp.PassengerBogie b =
                new TrainConsistmangementApp.PassengerBogie("First Class", 30);

        assertEquals("First Class", b.type);
        assertEquals(30, b.capacity);
    }
}