import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistmangementAppTest {

    @Test
    void testValidTrainID() {
        assertTrue(TrainConsistmangementApp.isValidTrainId("TRN-1234"));
    }

    @Test
    void testInvalidTrainID() {
        assertFalse(TrainConsistmangementApp.isValidTrainId("TRN12A"));
    }

    @Test
    void testValidCargoCode() {
        assertTrue(TrainConsistmangementApp.isValidCargoCode("PET-AB"));
    }

    @Test
    void testInvalidCargoCode() {
        assertFalse(TrainConsistmangementApp.isValidCargoCode("PET-ab"));
    }

    @Test
    void testEmptyInput() {
        assertFalse(TrainConsistmangementApp.isValidTrainId(""));
        assertFalse(TrainConsistmangementApp.isValidCargoCode(""));
    }
}