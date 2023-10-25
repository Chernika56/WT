package task6;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    public void test_1() {
        double[][] actual = Task6.getTable(new double[]{});
        double[][] expected = new double[][]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        double[][] actual = Task6.getTable(new double[]{1, 2, 3, 4, 5});
        double[][] expected = new double[][]{
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}
        };
        assertArrayEquals(expected, actual);
    }
}