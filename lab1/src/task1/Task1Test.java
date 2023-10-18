package task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void calculate() {
        double expected = Task1.calculate(3,4);
        double actual = 3.288;
        assertEquals(expected,actual,0.01);
    }
}