package Problem_7;

import java.util.ArrayList;
import java.util.List;

public class XstPrime {

    public static void main(String[] args) {
        System.out.println(getPrime(10001));
    }

    private static List<Integer> list = new ArrayList();

    public static int getPrime(int n) {
        setPrimeList(n);
        return list.get(n-1);
    }

    public static void setPrimeList(int n) {
        int i = 2;
        while (list.size() < n) {
            if (isPrime(i)) {
                list.add(i);
            }
            i++;
        }
    }

    public static boolean isPrime(int x) {
        for (int j = 0; j < list.size() ; j++) {
            if (x % list.get(j) == 0) {
                return false;
            }
        }
        return true;
    }
}
