package task3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    @Test
    public void test_1() {
        ArrayList<Double> actual = Task3.solve(-5, 0, -1);
        ArrayList<Double> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        ArrayList<Double> actual = Task3.solve(1, 2, 0.1);
        ArrayList<Double> expected = new ArrayList<>();
        expected.add(1.55);
        expected.add(1.96);
        expected.add(2.57);
        expected.add(3.60);
        expected.add(5.79);
        expected.add(14.10);
        expected.add(-34.24);
        expected.add(-7.70);
        expected.add(-4.29);
        expected.add(-2.93);
        expected.add(-2.19);
        actual.replaceAll(aDouble -> Math.floor(aDouble * 100) / 100);
        assertEquals(expected, actual);
    }
}