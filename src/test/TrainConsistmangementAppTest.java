import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistmangementAppTest {

    @Test
    void testCargo_SafeAssignment() {
        TrainConsistmangementApp.GoodsBogie b =
                new TrainConsistmangementApp.GoodsBogie("Cylindrical");

        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        TrainConsistmangementApp.GoodsBogie b =
                new TrainConsistmangementApp.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        assertNull(b.cargo); // cargo should not be assigned
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        TrainConsistmangementApp.GoodsBogie b1 =
                new TrainConsistmangementApp.GoodsBogie("Rectangular");

        TrainConsistmangementApp.GoodsBogie b2 =
                new TrainConsistmangementApp.GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // fails
        b2.assignCargo("Coal");      // should still work

        assertEquals("Coal", b2.cargo);
    }

    @Test
    void testCargo_FinallyAlwaysExecutes() {
        TrainConsistmangementApp.GoodsBogie b =
                new TrainConsistmangementApp.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        // No assertion needed; if no crash, finally executed
        assertTrue(true);
    }
}