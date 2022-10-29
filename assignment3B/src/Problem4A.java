import java.util.Arrays;

public class Problem4A {

    public static void main(String[] args) {
        System.out.println(fibIterative(4));
        System.out.println(fibIterative1(4));

    }

    public static int fibIterative(int n) {
        int[] fibSeries = new int[n + 1]; // keeping the size as n+1 to avoid out of bound exception

        fibSeries[0] = 0;
        fibSeries[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
        }

        return fibSeries[n];
    }

    public static int fibIterative1(int n) {
        int a = 0, b = 1, c = 0;

        if (n == 0 | n == 1)
            return n;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
