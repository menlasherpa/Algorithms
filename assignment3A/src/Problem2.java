public class Problem2 {

    public static void main(String[] args) {
        System.out.print(isPrime(3));
    }

    static int isPrime(int n) {
        if (n <= 1)
            return 0; //false
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return 0;
        }
        return 1; //true
    }

}
