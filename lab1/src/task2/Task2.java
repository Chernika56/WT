package task2;

public class Task2 {
    public static boolean isPointInArea(int x, int y) {
        boolean res = false;

        if ((x >= -4) && (x <= 4) && (y <= 5) && (y >= -3) || ((x >= -6) && (x <= 6) && (y <= 0) && (y >= -3))) {
            res = true;
        }

        return res;
    }
}
