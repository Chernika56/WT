package task8;

public class Task8 {
    public static void main(String[] args) {
        int[] test = findInsertIndex(new double[]{0, 1, 2, 3, 4, 6, 7, 9}, new double[]{2, 5, 8, 9, 10});
        printArray(test);
    }

    /**
     * Searches where to put elements of b sequence in a sequence,
     * so that a sequence still be non-decreasing
     *
     * @param arr1 sequence to put elements to
     * @param arr2 sequence to take elements from
     * @return indexes of array elements a before which you need,
     * to insert array elements b
     */
    public static int[] findInsertIndex(double[] arr1, double[] arr2) {
        int[] res = new int[arr2.length];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[j] <= arr1[i]) {
                res[j] = i;
                j++;
            }
        }

        for (int i = 0; j < arr2.length; i++, j++) {
            res[j] = arr1.length;
        }

        return res;
    }

    /**
     * Prints given array
     *
     * @param array array to print
     */
    private static void printArray(int[] array) {
        for (int elem : array) {
            System.out.printf("%1d ", elem);
        }
    }
}
