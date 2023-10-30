package task9_11;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Task9_11Test {

    @Test
    public void test_1() {
        Ball[] testBalls = new Ball[]{
                new Ball(Color.RED, 1.0),
                new Ball(Color.GREEN, 2.6),
                new Ball(Color.BLUE, 5.9)
        };
        Basket basket = new Basket(testBalls);
        basket.addBall(new Ball(Color.BLUE, 4.1));

        int actual = basket.countByColor(Color.BLUE);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_2() {
        Ball[] testBalls = new Ball[]{
                new Ball(Color.RED, 1.0),
                new Ball(Color.GREEN, 2.6),
                new Ball(Color.BLUE, 5.9)
        };
        Basket basket = new Basket(testBalls);
        basket.addBall(new Ball(Color.BLUE, 4.1));

        double actual = basket.calculateTotalWeight();
        double expected = 13.6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_3() {
        Ball[] testBalls = new Ball[]{
                new Ball(Color.RED, 1.0),
                new Ball(Color.GREEN, 2.6),
                new Ball(Color.BLUE, 5.9)
        };
        Basket basket = new Basket(testBalls);
        basket.addBall(new Ball(Color.GREEN, 4.1));

        int actual = basket.countByColor(Color.GREEN);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}