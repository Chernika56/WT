package task5;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(findNumOfExcess(new int[]{2, 3, 4, 1, 2, 3, 4}));
    }

    /**
     * Counts the least number of elements to be deleted to get increasing sequence
     *
     * @param array initial sequence
     * @return Number of elements to be deleted
     */
    public static int findNumOfExcess(int[] array) {
        return array.length - findIncLength(array);
    }

    /**
     * Finds the longest increasing subsequence
     *
     * @param array given sequence
     * @return Length of the longest increasing subsequence
     */
    private static int findIncLength(int[] array) {
        if (array.length == 1) {
            return 1;
        }

        int[] subArray = new int[array.length];

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((array[i] > array[j]) && (subArray[i] <= subArray[j] )) {
                    subArray[i]++;
                }
            }
        }

        int max = 0;

        for (int length : subArray) {
            max = Math.max(max, length);
        }

        return max + 1;
    }
}
