package task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void test_1() {
        boolean expected = Task2.isPointInArea(0, 0);
        assertTrue(expected);
    }
    @Test
    void test_2() {
        boolean expected = Task2.isPointInArea(5, 3);
        assertFalse(expected);
    }

    @Test
    void test_3(){
        boolean expected = Task2.isPointInArea(6, -3);
        assertTrue(expected);
    }
}