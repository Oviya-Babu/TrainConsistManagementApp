import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    @Test
    void testGrouping_BogiesGroupedByType() {
        List<UseCase9TrainConsistMgmt.Bogie> list = new ArrayList<>();

        list.add(new UseCase9TrainConsistMgmt.Bogie("Sleeper", 72));
        list.add(new UseCase9TrainConsistMgmt.Bogie("Sleeper", 70));

        Map<String, List<UseCase9TrainConsistMgmt.Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogiesByType(list);

        assertTrue(result.containsKey("Sleeper"));
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        List<UseCase9TrainConsistMgmt.Bogie> list = new ArrayList<>();

        list.add(new UseCase9TrainConsistMgmt.Bogie("Sleeper", 72));
        list.add(new UseCase9TrainConsistMgmt.Bogie("AC Chair", 56));

        Map<String, List<UseCase9TrainConsistMgmt.Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogiesByType(list);

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<UseCase9TrainConsistMgmt.Bogie> list = new ArrayList<>();

        Map<String, List<UseCase9TrainConsistMgmt.Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogiesByType(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        List<UseCase9TrainConsistMgmt.Bogie> list = new ArrayList<>();

        list.add(new UseCase9TrainConsistMgmt.Bogie("Sleeper", 72));
        list.add(new UseCase9TrainConsistMgmt.Bogie("AC Chair", 56));
        list.add(new UseCase9TrainConsistMgmt.Bogie("First Class", 24));

        Map<String, List<UseCase9TrainConsistMgmt.Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogiesByType(list);

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        List<UseCase9TrainConsistMgmt.Bogie> list = new ArrayList<>();

        list.add(new UseCase9TrainConsistMgmt.Bogie("AC Chair", 56));
        list.add(new UseCase9TrainConsistMgmt.Bogie("AC Chair", 60));

        Map<String, List<UseCase9TrainConsistMgmt.Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogiesByType(list);

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<UseCase9TrainConsistMgmt.Bogie> list = new ArrayList<>();

        list.add(new UseCase9TrainConsistMgmt.Bogie("Sleeper", 72));

        UseCase9TrainConsistMgmt.groupBogiesByType(list);

        // Original list should still have same size
        assertEquals(1, list.size());
    }
}