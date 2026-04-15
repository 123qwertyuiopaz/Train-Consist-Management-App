import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistmangementAppTest {

    @Test
    void testSafety_AllBogiesValid() {
        List<TrainConsistmangementApp.GoodsBogie> list = new ArrayList<>();
        list.add(new TrainConsistmangementApp.GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new TrainConsistmangementApp.GoodsBogie("Open", "Coal"));

        assertTrue(TrainConsistmangementApp.isSafe(list));
    }

    @Test
    void testSafety_CylindricalInvalidCargo() {
        List<TrainConsistmangementApp.GoodsBogie> list = new ArrayList<>();
        list.add(new TrainConsistmangementApp.GoodsBogie("Cylindrical", "Coal"));

        assertFalse(TrainConsistmangementApp.isSafe(list));
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<TrainConsistmangementApp.GoodsBogie> list = new ArrayList<>();
        list.add(new TrainConsistmangementApp.GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new TrainConsistmangementApp.GoodsBogie("Cylindrical", "Coal"));

        assertFalse(TrainConsistmangementApp.isSafe(list));
    }

    @Test
    void testSafety_EmptyList() {
        List<TrainConsistmangementApp.GoodsBogie> list = new ArrayList<>();

        assertTrue(TrainConsistmangementApp.isSafe(list));
    }
}