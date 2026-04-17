import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    private List<UseCase13TrainConsistMgmt.Bogie> createTestData() {
        return List.of(
                new UseCase13TrainConsistMgmt.Bogie("Sleeper", 72),
                new UseCase13TrainConsistMgmt.Bogie("AC Chair", 56),
                new UseCase13TrainConsistMgmt.Bogie("First Class", 80)
        );
    }

    @Test
    void testLoopFilteringLogic() {
        List<UseCase13TrainConsistMgmt.Bogie> result =
                UseCase13TrainConsistMgmt.filterWithLoop(createTestData());

        assertEquals(2, result.size()); // 72 & 80
    }

    @Test
    void testStreamFilteringLogic() {
        List<UseCase13TrainConsistMgmt.Bogie> result =
                UseCase13TrainConsistMgmt.filterWithStream(createTestData());

        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<UseCase13TrainConsistMgmt.Bogie> data = createTestData();

        List<UseCase13TrainConsistMgmt.Bogie> loopResult =
                UseCase13TrainConsistMgmt.filterWithLoop(data);

        List<UseCase13TrainConsistMgmt.Bogie> streamResult =
                UseCase13TrainConsistMgmt.filterWithStream(data);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<UseCase13TrainConsistMgmt.Bogie> data = createTestData();

        long start = System.nanoTime();
        UseCase13TrainConsistMgmt.filterWithLoop(data);
        long end = System.nanoTime();

        long time = end - start;

        assertTrue(time > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<UseCase13TrainConsistMgmt.Bogie> data = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            data.add(new UseCase13TrainConsistMgmt.Bogie("Sleeper", i % 100));
        }

        List<UseCase13TrainConsistMgmt.Bogie> result =
                UseCase13TrainConsistMgmt.filterWithStream(data);

        assertNotNull(result);
        assertTrue(result.size() > 0);
    }
}