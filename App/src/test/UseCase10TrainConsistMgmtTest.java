import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmtTest {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<UseCase10TrainConsistMgmt.Bogie> list = List.of(
                new UseCase10TrainConsistMgmt.Bogie("Sleeper", 72),
                new UseCase10TrainConsistMgmt.Bogie("AC Chair", 56),
                new UseCase10TrainConsistMgmt.Bogie("First Class", 24)
        );

        int total = UseCase10TrainConsistMgmt.calculateTotalSeats(list);

        assertEquals(152, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<UseCase10TrainConsistMgmt.Bogie> list = List.of(
                new UseCase10TrainConsistMgmt.Bogie("Sleeper", 72),
                new UseCase10TrainConsistMgmt.Bogie("Sleeper", 70)
        );

        int total = UseCase10TrainConsistMgmt.calculateTotalSeats(list);

        assertEquals(142, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<UseCase10TrainConsistMgmt.Bogie> list = List.of(
                new UseCase10TrainConsistMgmt.Bogie("Sleeper", 72)
        );

        int total = UseCase10TrainConsistMgmt.calculateTotalSeats(list);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<UseCase10TrainConsistMgmt.Bogie> list = new ArrayList<>();

        int total = UseCase10TrainConsistMgmt.calculateTotalSeats(list);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<UseCase10TrainConsistMgmt.Bogie> list = List.of(
                new UseCase10TrainConsistMgmt.Bogie("AC Chair", 56),
                new UseCase10TrainConsistMgmt.Bogie("First Class", 24)
        );

        int total = UseCase10TrainConsistMgmt.calculateTotalSeats(list);

        assertEquals(80, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<UseCase10TrainConsistMgmt.Bogie> list = new ArrayList<>();

        list.add(new UseCase10TrainConsistMgmt.Bogie("Sleeper", 72));
        list.add(new UseCase10TrainConsistMgmt.Bogie("AC Chair", 56));
        list.add(new UseCase10TrainConsistMgmt.Bogie("First Class", 24));

        int total = UseCase10TrainConsistMgmt.calculateTotalSeats(list);

        assertEquals(152, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<UseCase10TrainConsistMgmt.Bogie> list = new ArrayList<>();

        list.add(new UseCase10TrainConsistMgmt.Bogie("Sleeper", 72));

        UseCase10TrainConsistMgmt.calculateTotalSeats(list);

        // ensure list unchanged
        assertEquals(1, list.size());
    }
}