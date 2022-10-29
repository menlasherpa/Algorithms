public class Problem4B {

    public static void main(String[] args) {
        System.out.print(fibRecursiveFast(9));

    }

    public static int fibRecursiveFast(int n) {
        int[] fibSeries = new int[n + 1];

        if (n == 0 | n == 1)
            return n;

        int val = fibRecursiveFast(n-1) + fibRecursiveFast(n-2);
        fibSeries[n] = val;
        return val;
    }
}
