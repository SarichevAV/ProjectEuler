package Problem_5;

public class SmallestMultiple {
    public static void main(String[] args) {
        final int START_VARIABLE = 20;
        System.out.println(findSmallestMultiple(START_VARIABLE));
    }

    public static long findSmallestMultiple(int n) {
        for (long i = n; i < calculateFactorial(n); i += n) {
            if (isMultiple(i, n)) {
                return i;
            }
        }
        return -1;
    }

    public static long calculateFactorial(int n) {
        if (n > 1) {
            return n * calculateFactorial(n - 1);
        }
        if (n >= 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static boolean isMultiple(long x, int n) {
        for (int i = 1; i < n; i++) {
            if (x % i != 0) {
                return false;
            }
        }
        return true;
    }
}
