package test;

import main.UseCase8TrainConsistMgmt;
import main.UseCase8TrainConsistMgmt.Bogie;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC", 50));

        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(list, 60);

        assertEquals(1, result.size());
        assertEquals("Sleeper", result.get(0).getName());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("AC", 50));

        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("General", 90));

        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(list, 60);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_EmptyList() {
        List<Bogie> list = new ArrayList<>();

        List<Bogie> result = UseCase8TrainConsistMgmt.filterBogies(list, 60);

        assertTrue(result.isEmpty());
    }
}