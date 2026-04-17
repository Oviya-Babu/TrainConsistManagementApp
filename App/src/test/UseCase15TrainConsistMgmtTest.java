import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgmtTest {

    @Test
    void testCargo_SafeAssignment() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmt.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo()); // not assigned
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        UseCase15TrainConsistMgmt.GoodsBogie b1 =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        UseCase15TrainConsistMgmt.GoodsBogie b2 =
                new UseCase15TrainConsistMgmt.GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // fails
        b2.assignCargo("Petroleum"); // still works

        assertEquals("Petroleum", b2.getCargo());
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        // Just ensure no crash & method executes fully
        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }
}