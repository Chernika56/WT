package task6;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    public void test_1() {
        int[][] actual = Task6.getTable(new int[]{});
        int[][] expected = new int[][]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[][] actual = Task6.getTable(new int[]{1, 2, 3, 4, 5});
        int[][] expected = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}
        };
        assertArrayEquals(expected, actual);
    }
}