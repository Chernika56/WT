package task4;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(findPrimeInArray(new int[]{1, 2, 2, 4, 5, 101}));
    };

    /**
     * Checks if n is prime value
     *
     * @param num number to check
     * @return true if n is prime, false otherwise
     */
    private static boolean isPrime(int num) {
      if (num < 2) return false;
      if (num <= 3) return true;
      if (num % 2 == 0) return false;

      for (int i = 5; i <= Math.sqrt(num) + 1; i += 2) {
          if (num % i == 0) return false;
      }

      return true;
    };

    /**
     * Finds primes in the given array
     *
     * @param numbers array to find primes
     * @return List of prime indices
     */
    public static ArrayList<Integer> findPrimeInArray(int[] numbers) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                res.add(i);
            }
        }

        return res;
    };
}
