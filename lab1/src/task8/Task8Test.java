package task8;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    public void test_1() {
        int[] actual = Task8.findInsertIndex(new double[]{0, 1, 2, 3, 4, 6, 7, 9}, new double[]{2, 5, 8, 9, 10});
        int[] expected = new int[]{2, 5, 7, 8, 8};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] actual = Task8.findInsertIndex(new double[]{0}, new double[]{10});
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[] actual = Task8.findInsertIndex(new double[]{0}, new double[]{-10});
        int[] expected = new int[]{0};
        assertArrayEquals(expected, actual);
    }
}