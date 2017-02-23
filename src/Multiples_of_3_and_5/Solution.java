package Multiples_of_3_and_5;

/**
 * Created by andrej on 23.02.17.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int max = 1000;

        for (int i = 0; i < max; i++) {
            if ((i % 3 == 0) | (i % 5 == 0))
                sum+=i;
        }
        System.out.println(sum);
    }
}
