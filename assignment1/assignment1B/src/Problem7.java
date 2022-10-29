public class Problem7 {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; ++i) {
            System.out.print(generate(i) + " ");
        }
    }

    public static int generate(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        //implement
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 2; i <= n ; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
