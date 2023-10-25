package task5;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void test_1() {
        int actual = Task5.findNumOfExcess(new int[]{1, 2, 5, 3, 4});
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        int actual = Task5.findNumOfExcess(new int[]{2, 4, 4, 4, 3, 5, 6});
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        int actual = Task5.findNumOfExcess(new int[]{2, 3, 4, 1, 2, 3, 4});
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }
}