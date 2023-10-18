package task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void isPointInArea() {
        boolean expected = Task2.isPointInArea(0, 0);
        assertTrue(expected);
        expected = Task2.isPointInArea(5, 3);
        assertFalse(expected);
        expected = Task2.isPointInArea(6, -3);
        assertTrue(expected);
    }
}