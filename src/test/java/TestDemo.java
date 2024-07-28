import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestDemo {
    @Test
    void succeedingTest(){
        assertTrue(3 % 2 == 0);
    }
    @RepeatedTest(10)
    void failingTest(RepetitionInfo repetitionInfo){
        if (repetitionInfo.getCurrentRepetition() == 3) {
            fail("a failing Practice.test");
        }
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testParameterizedTest(int n){
        if(n==3)
            fail("a failing Practice.test");
    }
}