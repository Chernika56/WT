package task7;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    public void test_1() {
        int[] actual = new int[]{2, 6, 3, 9, 0, -3};
        Task7.sort(actual);
        int[] expected = new int[]{-3, 0, 2, 3, 6, 9};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int[] actual = new int[]{1, 2, 3, 4, 5, 6};
        Task7.sort(actual);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int[] actual = new int[]{6, 5, 4, 3, 2, 1};
        Task7.sort(actual);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_4() {
        int[] actual = new int[]{};
        Task7.sort(actual);
        int[] expected = new int[]{};
        assertArrayEquals(expected, actual);
    }
}