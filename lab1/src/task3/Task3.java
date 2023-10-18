package task3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        printList(solve(1, 2, 0.1), 1, 0.1);
    }

    /**
     * Calculates F(x) = tan(x)
     *
     * @param a left border of the range
     * @param b right border of the range
     * @param h step
     * @return F(x) = tan(x)
     */
    public static ArrayList<Double> solve(double a, double b, double h) {
        ArrayList<Double> res = new ArrayList<>();

        if (a > b || h <= 0) {
            return res;
        }

        for (double x = a; x < b + h; x += h) {
            res.add(Math.tan(x));
        }

        return res;
    }

    /**
     * Prints the given list elements
     *
     * @param list list to be printed
     * @param a    left border of the x parameter
     * @param h    step
     */
    private static void printList(ArrayList<Double> list, double a, double h) {
        System.out.printf("x %4s tg(x)%n", " ");
        for (int i = 0; i < list.size(); i++, a += h) {
            System.out.printf("%.2f %6.2f %n", a, list.get(i));
        }
    }

}
