package task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(calculate(3, 4));
    }

    /**
     *
     * @param x parameter of the equation
     * @param y parameter of the equation
     * @return result of (1 + sin(x + y)^2) / (2 + |x - (2 * x) / (1 + x^2 * y^2)|) + x
     */
    static public double calculate(double x, double y){
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + x * x * y * y));
        return numerator / denominator + x;
    }
}
