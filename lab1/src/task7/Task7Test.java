package task7;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    public void test_1() {
        double[] actual = new double[]{2, 6, 3, 9, 0, -3};
        Task7.sort(actual);
        double[] expected = new double[]{-3, 0, 2, 3, 6, 9};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_2() {
        double[] actual = new double[]{1, 2, 3, 4, 5, 6};
        Task7.sort(actual);
        double[] expected = new double[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_3() {
        double[] actual = new double[]{6, 5, 4, 3, 2, 1};
        Task7.sort(actual);
        double[] expected = new double[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test_4() {
        double[] actual = new double[]{};
        Task7.sort(actual);
        double[] expected = new double[]{};
        assertArrayEquals(expected, actual);
    }
}