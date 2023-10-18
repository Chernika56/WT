package task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void test_1() {
        double actual = Task1.calculate(3.0,4.0);
        double expected = 3.28;
        assertEquals(expected,actual,0.1);
    }
    @Test
    void test_2(){
        double actual= Task1.calculate(1.0,2.1);
        double expected = 1.38;
        assertEquals(expected,actual,0.1);
    }
    @Test
    void test_3(){
        double actual = Task1.calculate(0,0);
        double expected = 0.5;
        assertEquals(expected,actual,0.1);
    }
}