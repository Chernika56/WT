package task7;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 6, 3, 9, 1, -3};
        sort(array);
        printArray(array);
    }

    /**
     * Sorts the given array
     *
     * @param array array to sort
     */
    public static void sort(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    /**
     * Swaps two elements of the array
     *
     * @param array  given array
     * @param index1 index to swap
     * @param index2 index to swap
     */
    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    /**
     * Prints given array
     *
     * @param array array to print
     */
    private static void printArray(int[] array) {
        for (int elem : array) {
            System.out.printf("%2d ", elem);
        }
    }
}
