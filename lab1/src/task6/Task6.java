package task6;

public class Task6 {
    public static void main(String[] args) {
        printArray(getTable(new int[]{1, 2, 3, 4, 5}));
    }

    /**
     * Generates two-dimensional array filled by the rule:<br>
     * a1   a2 ... an-1  an <br>
     * a2   a3 ... an    a1 <br>
     * ... ... ... ...  ... <br>
     * an-1 an ... an-3 an-2<br>
     * an   a1 ... an-2 an-1<br>
     *
     * @param sequence initial array
     * @return filled array
     */
    public static int[][] getTable(int[] sequence) {
        int length = sequence.length;
        int[][] res = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                res[i][j] = sequence[(j + i) % length];
            }
        }

        return res;
    }

    /**
     * Prints given array
     *
     * @param array array to print
     */
    private static void printArray(int[][] array) {
        for (int[] rows : array) {
            for (int elem : rows) {
                System.out.printf("%3d", elem);
            }
            System.out.println();
        }
    }
}
