package task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isPointInArea(0, 0));
    }

    /**
     *
     * @param x horizontal coordinate
     * @param y vertical coordinate
     * @return true if {x, y} is in the area, false on other cases
     */
    public static boolean isPointInArea(int x, int y) {
        boolean res = false;

        if ((Math.abs(x) <= 4) && (y <= 5) && (y >= -3) || ((Math.abs(x) <= 6) && (y <= 0) && (y >= -3))) {
            res = true;
        }

        return res;
    }
}
