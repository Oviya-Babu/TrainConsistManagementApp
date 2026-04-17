import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmtTest {

    private String[] prepare(String[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    @Test
    void testBinarySearch_BogieFound() {
        String[] arr = prepare(new String[]{"BG101","BG205","BG309","BG412","BG550"});
        assertTrue(UseCase19TrainConsistMgmt.binarySearch(arr, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] arr = prepare(new String[]{"BG101","BG205","BG309","BG412","BG550"});
        assertFalse(UseCase19TrainConsistMgmt.binarySearch(arr, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] arr = prepare(new String[]{"BG101","BG205","BG309"});
        assertTrue(UseCase19TrainConsistMgmt.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] arr = prepare(new String[]{"BG101","BG205","BG309"});
        assertTrue(UseCase19TrainConsistMgmt.binarySearch(arr, "BG309"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] arr = prepare(new String[]{"BG101"});
        assertTrue(UseCase19TrainConsistMgmt.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] arr = {};
        assertFalse(UseCase19TrainConsistMgmt.binarySearch(arr, "BG101"));
    }

    @Test
    void testBinarySearch_UnsortedInputHandled() {
        String[] arr = prepare(new String[]{"BG309","BG101","BG550","BG205","BG412"});
        assertTrue(UseCase19TrainConsistMgmt.binarySearch(arr, "BG205"));
    }
}