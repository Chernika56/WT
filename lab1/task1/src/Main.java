import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x and y");

        x = scanner.nextDouble();
        y = scanner.nextDouble();

        System.out.println(calculating(x, y));
    }

    private static double calculating(double x, double y) {
        double result;
        result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - ((2 * x) / (1 + x * x * y * y)))) + x;
        return result;
    }
}