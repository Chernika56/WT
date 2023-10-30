package task9_11;

import java.awt.*;

public class Task9_11 {
    public static void main(String[] args) {
        Ball[] myBalls = new Ball[] {
                new Ball(Color.RED, 2.0),
                new Ball(Color.GREEN, 1.5),
                new Ball(Color.BLUE, 1.0)
        };

        Basket basket = new Basket(myBalls);
        basket.addBall(new Ball(Color.BLUE, 3.0));

        int counter = basket.countByColor(Color.BLUE);
        double totalWeight = basket.calculateTotalWeight();
        System.out.printf("Total blue balls: %d", counter);
        System.out.printf("\nTotal weight: %3.2f ", totalWeight);
    }
}
