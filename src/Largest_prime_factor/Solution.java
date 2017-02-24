package Largest_prime_factor;

import java.util.ArrayList;

/**
 * Created by andrej on 23.02.17.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 */

public class Solution {
    public static boolean Prime(int n) {
            int count = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) count++;
            }
            if (count > 2) return false; // Если число делителей больше 2, то число не простое
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> PrimeFactors = new ArrayList<Integer>();
        long number = 600851475143L;
        for (int i = 2; i <= number; i++) {
            if (Prime(i)) {  // Проверка на простое число
                if (number % i == 0) {
                    PrimeFactors.add(i);
                    number /= i;
                }
            }
        }
        // Вывод на консоль
        for (int j: PrimeFactors) {
            System.out.print(j + " ");

        }
    }
}
